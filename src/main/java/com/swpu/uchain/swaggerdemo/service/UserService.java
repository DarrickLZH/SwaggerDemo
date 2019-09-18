package com.swpu.uchain.swaggerdemo.service;

import com.swpu.uchain.swaggerdemo.DTO.LogInDTO;
import com.swpu.uchain.swaggerdemo.DTO.RoleDTO;
import com.swpu.uchain.swaggerdemo.entity.User;
import com.swpu.uchain.swaggerdemo.vo.ResultVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author；lzh
 * @Date:2019/8/1415:39 Descirption:
 */
public interface UserService {

    public User getUserByUserId(String userId);

    public Map login(LogInDTO logInDTO, HttpServletResponse response);

    public User getCurrentUser();

    public Map<String, List<User>> getAllUser();

    public ResultVO updataRole(RoleDTO roleDTO);
}
