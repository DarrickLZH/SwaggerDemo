package com.swpu.uchain.swaggerdemo.dao;

import com.swpu.uchain.swaggerdemo.DTO.RoleDTO;
import com.swpu.uchain.swaggerdemo.Enum.RoleEnum;
import com.swpu.uchain.swaggerdemo.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User getUserByUserId(String stuId);

    int updateUserRole(RoleDTO roleDTO);
}