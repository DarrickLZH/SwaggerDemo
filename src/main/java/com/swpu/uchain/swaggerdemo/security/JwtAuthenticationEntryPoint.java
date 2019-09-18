package com.swpu.uchain.swaggerdemo.security;

import com.alibaba.fastjson.JSON;
import com.swpu.uchain.swaggerdemo.Enum.ResultEnum;
import com.swpu.uchain.swaggerdemo.util.ResultVOUtil;
import com.swpu.uchain.swaggerdemo.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author；lzh
 * @Date:2019/8/1319:09 Descirption: 拦截器，拦截未进行身份认证
 */
@Component
@Slf4j
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException {
        httpServletResponse.setHeader("Access_Control_Allow_Origin","*");
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html; charset=utf-8");
        ResultVO result = ResultVOUtil.error(ResultEnum.AUTHENTICATION_ERROR);
        log.info("需要身份认证:{}" ,result);
        httpServletResponse.getWriter().append(JSON.toJSONString(result));
    }
}
