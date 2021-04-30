package com.aki.designpattern.行为型.策略模式;

public class TestMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDecoder(new FfmpegDecoder());//不同的解码策略
        mediaPlayer.decodeVideo();//不同的解码播放
        mediaPlayer.setDecoder(new MediaCodecDecoder());
        mediaPlayer.decodeVideo();
    }
}
