package coil.benchmark

import android.content.Context
import android.util.Log
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.core.net.toUri
import java.lang.Exception

// File containing the common benchmark code.

private val IMAGES = arrayOf(
    "image_1.jpg",
    "image_2.jpg",
    "image_3.jpg",
    "image_4.jpg",
    "image_5.jpg",
    "image_6.png",
    "image_7.png",
    "image_8.png",
    "image_9.png",
    "image_10.png",
)

fun benchmarkFileUriGet(
    context: Context,
    rule: BenchmarkRule,
    service: ImageService
) = rule.measureRepeated {
    val uris = runWithTimingDisabled {
        createFileUris(context, *IMAGES)
    }
    uris.forEach { uri ->
        try {
            service.execute(uri)
        } catch (e: Exception) {
            Log.e("Benchmark", "Failed for $uri with $e")
            throw e
        }
    }
}

fun benchmarkNetworkUriGet(
    context: Context,
    rule: BenchmarkRule,
    service: ImageService
) = rule.measureRepeated {
    val mockWebServer = runWithTimingDisabled {
        createMockWebServer(context, *IMAGES)
    }
    mockWebServer.use { server ->
        IMAGES.forEach { image ->
            try {
                service.execute(server.url(image).toString().toUri())
            } catch (e: Exception) {
                Log.e("Benchmark", "Failed for $image with $e")
                throw e
            }
        }
    }
}
