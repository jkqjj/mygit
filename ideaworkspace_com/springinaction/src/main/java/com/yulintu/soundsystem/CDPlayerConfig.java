package com.yulintu.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qianjiajia on 2016/11/24.
 */

/**
 * 通过java代码定义了spring的装配规则
 * CDPlayerConfig类并没有显示地声明任何bean，
 * 只不过它使用了@ComponentScan注解，
 * 这个注解能够在spring中启用组件扫描
 *
 * 如果没有其他的配置的话，
 * @ComponentScan默认会扫描与配置类相同的包，因为CDPlayerConfig类位于soundsystem包中
 * 因此spring将会扫描这个包以及这个包下的所有的子包，
 * 查找带有@Component注解的类。
 * 这样的话就能发现CompactDisc，
 * 并且会在spring中自动为其创建一个bean。
 */

/**
 * JavaConfig与其他的java代码又有所区别，在概念上，它与应用程序中的业务逻辑和领域代码是不同的
 * 尽管它与其他的组件一样都使用相同的语言进行表述，
 * 但业务逻辑和代码领域是不同的。
 * 尽管它与其他的组件一样都使用相同的语言进行表述，
 * 但是JavaConfig是配置代码，
 * 这就意味着它不应该包含任何业务逻辑，
 * JavaConfig也不应该侵入到业务逻辑代码之中。
 * 尽管不是必须的，但通常会将JavaConfig放到单独的包中，
 * 使它的应用逻辑分离开来，这样对于他的意图就不会产生困惑了。
 */

/**
 * @Configuration注解表明这个类是一个配置类，
 * 该类包含在spring应用上下文如何创建bean的细节。
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
