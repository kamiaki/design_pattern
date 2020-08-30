package com.aki.designpattern.适配器模式.advancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

   @Override
   public void playVlc(String fileName) {
      //do nothing
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);
   }
}
