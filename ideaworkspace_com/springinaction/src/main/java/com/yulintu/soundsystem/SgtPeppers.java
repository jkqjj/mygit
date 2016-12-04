package com.yulintu.soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by qianjiajia on 2016/11/24.
 */

/**
 * 这个注解表明该类会作为组件类，并且告知Spring要为这个类创建bean
 * 不需要显示的配置SgtPeppers bean因为它使用了@Component注解
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles.";

    public void play() {
        System.out.println(" Playing "+title+" by "+artist);
    }

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int)Math.floor(Math.random() *  4);
        //if (choice == 0){
        //    return new SgtPeppers();
        //}else if (choice == 1){
        //    return new WhiteAlbum();
        //}else if (choice == 2){
        //    return new HardDayNight();
        //}else {
        //    return new Revolver();
        //}
        return null ;
    }

}
