package com.swpu.uchain.swaggerdemo.controller;

import com.swpu.uchain.swaggerdemo.DTO.RoleDTO;
import com.swpu.uchain.swaggerdemo.Enum.RoleEnum;
import com.swpu.uchain.swaggerdemo.accessctro.RoleNum;
import com.swpu.uchain.swaggerdemo.service.UserService;
import com.swpu.uchain.swaggerdemo.util.ResultVOUtil;
import com.swpu.uchain.swaggerdemo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author；lzh
 * @Date:2019/8/18 10:55
 * @Descirption:
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "用户管理接口")
public class UserController {

    @Autowired
    private UserService userService;

    @RoleNum(role = RoleEnum.ADMIN)
    @ApiOperation("管理员授权")
    @PostMapping(value = "/updateRole", name = "管理员授权")
    public Object updateRole(RoleDTO roleDTO) {
        ResultVO resultVO = userService.updataRole(roleDTO);
        return resultVO;
    }

    @RoleNum(role = RoleEnum.ADMIN)
    @ApiOperation("获取所有用户信息")
    @GetMapping(value = "/getAll", name = "获取所有用户信息")
    public Object getAll() {
        return ResultVOUtil.success(userService.getAllUser());
    }

}
