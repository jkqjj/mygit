import com.yulintu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by qianjiajia on 2016/11/28.
 */
public class MybatisTest {
    SqlSessionFactory sf;

    @Before
    public void initSF()throws Exception{
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
         sf= new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test//根据id查询
    public void test1() throws Exception{

        SqlSession session = sf.openSession();
        User u = session.selectOne("com.yulintu.domain.User.selectUserById","0001");
        System.out.println(u);
    }

    @Test//查询所有
    public void test2() throws Exception{

        SqlSession session = sf.openSession();
        List<User> users = session.selectList("com.yulintu.domain.User.selectAllUser");
        for (User u:users){
            System.out.println(u);
        }

    }

    @Test//插入User
    public void test3() throws Exception{
        SqlSession session = sf.openSession();
        User u = new User();
        u.setId("0003");
        u.setUserName("jiajia");
        u.setAddress("chengdu");
        //插入的条数即影响到数据库的条数
        int i = session.insert("com.yulintu.domain.User.insertUser",u);
        //提交事物
        session.commit();
        System.out.println(i);

    }
}
