package com.aki.designpattern.策略模式;

/**
 * 视频播放器：环境类
 */
public class MediaPlayer {

    private Decoder decoder;

    public void setDecoder(Decoder decoder) {
        this.decoder = decoder;
    }

    public void decodeVideo() {
        decoder.decodeVideo();
    }
}


