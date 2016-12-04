package Java_web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();

        if (session.getAttribute("userid") != null){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletRequest.getRequestDispatcher("login.jsp").forward(servletRequest,servletResponse);
        }
    }

    public void destroy() {

    }
}
