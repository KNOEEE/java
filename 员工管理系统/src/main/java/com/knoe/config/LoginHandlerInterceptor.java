package com.knoe.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author KNOE
 * @date 2020-10-26 11:18
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆success之后 应该有用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            //没有登陆
            request.setAttribute("msg", "没有权限，请先登陆");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
}
