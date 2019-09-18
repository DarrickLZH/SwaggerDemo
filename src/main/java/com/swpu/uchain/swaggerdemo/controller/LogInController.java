package com.swpu.uchain.swaggerdemo.controller;

import com.swpu.uchain.swaggerdemo.DTO.LogInDTO;
import com.swpu.uchain.swaggerdemo.service.UserService;
import com.swpu.uchain.swaggerdemo.util.ResultVOUtil;
import com.swpu.uchain.swaggerdemo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author；lzh
 * @Date:2019/8/18 10:41
 * @Descirption:
 */
@RestController
@Api(tags = "匿名访问接口")
public class LogInController {

    @Autowired
    private UserService userService;

    @ApiOperation("登录接口")
    @PostMapping(value = "/login", name = "登录")
    public ResultVO Login(LogInDTO logInDTO, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();
        map = userService.login(logInDTO, httpServletResponse);
        return ResultVOUtil.success(map);
    }

}
