package com.atguigu.ggkt.vod.service;


public interface VodService {
    //上传视频
    String updateVideo();

    //删除腾讯云视频
    void removeVideo(String fileId);


}
