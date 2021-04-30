package com.aki.designpattern.结构型.适配器模式;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //内置支持播放mp3音乐文件
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放mp3文件, 名称: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            //mediaAdapter提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("无效的媒体: " + audioType + ", 不支援的格式");
        }
    }
}
