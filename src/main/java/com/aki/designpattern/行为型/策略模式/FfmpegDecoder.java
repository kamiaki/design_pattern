package com.aki.designpattern.行为型.策略模式;

public class FfmpegDecoder extends Decoder {
    @Override
    void decodeVideo() {
        System.out.println("ffmpeg解码器");
    }
}
