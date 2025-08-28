package iuh.fit.se.ltwww_java_28082025_tuan02_nguyentranlong.Baitap1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Request đi qua Filter");
        chain.doFilter(request, response);
        System.out.println("Response đi qua Filter");
    }
}
