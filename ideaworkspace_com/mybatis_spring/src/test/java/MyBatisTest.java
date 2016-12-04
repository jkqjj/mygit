import com.yulintu.dao.IUserDao;
import com.yulintu.domain.User;
import com.yulintu.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by qianjiajia on 2016/11/29.
 */
public class MyBatisTest {



    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        User u = userDao.findUserById("0003");
        System.out.println(u);
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        List<User> users = userDao.findAllUser();
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        User user = new User();
        user.setId("0002");
        user.setUserName("lilanqing");
        user.setAddress("guangxi");
        List<User> users = userDao.findUserByCondition(user);
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        int i = userDao.deleteUserById("0002");
        System.out.println(i);
    }

    @Test
    public void test5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        User user = new User();
        user.setId("0002");
        user.setUserName("lilanqing");
        user.setAddress("guangxi");
        int i = userDao.saveUser(user);
        System.out.println(i);
    }

    @Test
    public void test6(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        User user = new User();
        user.setId("0002");
        user.setUserName("lanqing");
        user.setAddress("chengdu");
        int i = userDao.updateUserById(user);
        System.out.println(i);
    }

    @Test
    public void test7(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao)ctx.getBean("userDao");
        User user = new User();
        user.setId("0004");
        user.setUserName("jiajia");
        user.setAddress("chengdu");
        //int i = userDao.updateUserById(user);
        int i = userDao.updateUserByCondition(user);
        System.out.println(i);
    }

    @Test
    public void test8(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        int i = userService.deleteUserById("0004");
        System.out.println(i);
    }
}
