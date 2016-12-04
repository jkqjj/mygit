package Java_web;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class EncodingFilter implements Filter {
    private String charSet;
    public void init(FilterConfig filterConfig) throws ServletException {
        this.charSet = filterConfig.getInitParameter("charSet");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(this.charSet);
    }

    public void destroy() {

    }
}
