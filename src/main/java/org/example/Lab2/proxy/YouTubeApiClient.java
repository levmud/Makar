package org.example.Lab2.proxy;


import java.util.HashMap;

public interface YouTubeApiClient {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
