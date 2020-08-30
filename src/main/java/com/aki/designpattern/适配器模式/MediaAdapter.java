package com.aki.designpattern.适配器模式;

import com.aki.designpattern.适配器模式.advancedMediaPlayer.AdvancedMediaPlayer;
import com.aki.designpattern.适配器模式.advancedMediaPlayer.Mp4Player;
import com.aki.designpattern.适配器模式.advancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){

      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();

      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }
   }

   @Override
   public void play(String audioType, String fileName) {

      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
