package com.yulintu.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by qianjiajia on 2016/11/24.
 */

/**
 * @Autowired注解不仅能够用在构造器上，还能用在属性的Setter方法上。
 * 比如说，如果CDPlayer有一个setCompactDisc()方法，那么可以采用如下的注解形式进行自动装配：
 * @Autowired
 * public void setCompactDisc(CompactDisc cd){
 *     this.cd = cd;
 * }
 *
 * 在spring初始化bean之后，他会尽可能的去满足bean的依赖。
 * 在下面的代码中，依赖是通过带有@Autowired注解的方法进行生命的，
 * 也就是setCompactDisc()。
 *
 * 实际上，Setter方法并没有什么特殊之处，
 * @Autowired注解可以用在类的任何方法上。
 *
 * 不管是构造器、Setter方法还是其他的方法，spring都会尝试满足方法参数上所生命的依赖。
 * 假如有且只有一个bean匹配依赖需求的话，那么这个bean将会被装配进来。
 * 如果没有匹配的bean，那么在应用上下文创建的时候，spring会抛出一个异常。
 * 为了避免一场的出现，可以将@Autowired的required属性设置为false。
 * @Autowired(required = false)
 * public CDPlayer(CompactDisc cd){
 * this.cd = cd;
 * }
 * 将required属性设置为false时，spring会尝试执行自动装配，但是如果没有匹配的bean的话，
 * spring将会让这个bean处于未装配的状态。
 * 但是，required属性设置为false时，你需要谨慎对待，如果在你的代码中没有进行null检查的话，
 * 这个处于未装配状态的属性有可能会出现NullPointerException。
 *
 * 如果有多个bean都能满足以来关系的话，spring将会抛出一个异常，
 * 表明没有明确指出要选定哪个bean进行自动装配。
 *
 * @Autowired是spring特有的注解，
 * 如果你不愿意在代码中到处使用spring的特有注解来完成自动装配，
 * 你可以考虑将其替换为@Inject。
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    //@Autowired
    //public CDPlayer(CompactDisc cd){
    //    this.cd = cd;
    //}

    /**
     * 选择构造器注入还是是属性注入，作为一个通用的规则：
     * 对强依赖使用构造器注入；
     * 对可选性的依赖使用属性注入。
     * @param compactDisc
     */
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
