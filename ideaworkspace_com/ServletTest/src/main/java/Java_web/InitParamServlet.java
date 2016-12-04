package Java_web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class InitParamServlet extends HttpServlet {

    private String initParam = null;

    /**
     * 用于接收初始化参数
     * @param config
     * @throws ServletException
     */
    public void init(ServletConfig config) throws ServletException{
        //接收初始化参数
        this.initParam = config.getInitParameter("ref");
    }

    /**
     * 处理服务
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //输出初始化参数
        System.out.println("初始化参数:"+this.initParam);
    }

    /**
     * 处理服务
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用doGet()
        this.doGet(req, resp);
    }
}
