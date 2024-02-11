package com.Modules.M5_MultiThreading.S3_CreateThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VideoProcessingTask implements Runnable {
    private String videoFile;

    public VideoProcessingTask(String videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public void run() {
        // Simulate video processing logic
        System.out.println("Processing video file: " + videoFile);
        // Additional video processing logic can be added here
    }
}

public class VideoProcessingApplication {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Simulate multiple video files to be processed
        String[] videoFiles = {"video1.mp4", "video2.mp4", "video3.mp4"};

        // Submit video processing tasks to the thread pool
        for (String videoFile : videoFiles) {
            executorService.submit(new VideoProcessingTask(videoFile));
        }

        // Shut down the thread pool
        executorService.shutdown();
    }
}

// The output of the above program is shown as below
/*
Processing video file: video3.mp4
Processing video file: video1.mp4
Processing video file: video2.mp4
 */