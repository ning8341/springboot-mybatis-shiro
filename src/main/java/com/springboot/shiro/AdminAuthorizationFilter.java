package com.springboot.shiro;

import com.springboot.entity.User;
import com.springboot.utils.UserUtils;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 自定义过滤器  shiro的登录过滤
 * */
public class AdminAuthorizationFilter extends AuthorizationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        User user = UserUtils.getUser();
        if(user != null){
            return true;
        }
        return false;
    }
}
