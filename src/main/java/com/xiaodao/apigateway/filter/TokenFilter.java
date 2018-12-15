/*
package com.xiaodao.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

*/
/**
 * @ClassName : TokenFilter
 * @Description : TODO
 * @Author : xiaodao
 * @Date : 2018/12/9  18:08
 * @Version : 1.0
 **//*

@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER -1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
      */
/*  RequestContext requestContext =  RequestContext.getCurrentContext();
        HttpServletRequest request =  requestContext.getRequest();
       String token =  request.getParameter("token");
       if(StringUtils.isEmpty(token)){
       //    requestContext.setSendZuulResponse(false);
        //   requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
       }
        return null;*//*

    }
}
*/
