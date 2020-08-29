package com.aki.designpattern.策略模式;

public class MediaCodecDecoder extends Decoder {

    @Override
    void decodeVideo() {
        System.out.println("媒体编解码器");
    }
}
