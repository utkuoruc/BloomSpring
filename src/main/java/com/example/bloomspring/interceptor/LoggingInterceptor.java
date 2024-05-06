package com.example.bloomspring.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.apache.log4j.Logger;

public class LoggingInterceptor implements HandlerInterceptor {
    private static final Logger logger = Logger.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Request URL: " + request.getRequestURL().toString());
        return true;
    }
}
