//package com.example.agua.MLKit
//
//import androidx.camera.core.CameraSelector
//import androidx.camera.core.ImageAnalysis
//import androidx.camera.lifecycle.ProcessCameraProvider
//import androidx.compose.ui.geometry.Rect
//import androidx.compose.ui.tooling.preview.Preview
//import com.google.firebase.ml.vision.FirebaseVision
//
//class MLkit {
//    // Start camera
//    val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
//    cameraProviderFuture.addListener(Runnable {
//        val cameraProvider = cameraProviderFuture.get()
//        val preview = Preview.Builder()
//            .build()
//            .also {
//                it.setSurfaceProvider(viewFinder.surfaceProvider)
//            }
//
//        // Image analysis use case
//        val imageAnalysis = ImageAnalysis.Builder()
//            .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
//            .build()
//
//        imageAnalysis.setAnalyzer(cameraExecutor, ImageAnalysis.Analyzer { image ->
//
//            // Run ML model on image
//            val options = FirebaseVision.getInstance()
//                .getVisionObjectDetectorOptions()
//            val detector = FirebaseVision.getInstance()
//                .getVisionObjectDetector(options)
//
//            val result = detector.detectInImage(image)
//            result.forEach {
//
//                // Draw bounding box
//                val rect = it.boundingBox
//                val bbox = Rect(rect.left, rect.top, rect.right, rect.bottom)
//                viewFinder.post {
//                    viewFinder.overlay.add(bbox)
//                }
//            }
//
//        })
//
//        // Bind use cases
//        val camera = cameraProvider.bindToLifecycle(
//            this, CameraSelector.DEFAULT_BACK_CAMERA, preview, imageAnalysis)
//
//    }, ContextCompat.getMainExecutor(this))
//
//}, modifier = Modifier.padding(16.dp)
//.align(Alignment.BottomEnd)
//.clickable{}
//)
//}
//}