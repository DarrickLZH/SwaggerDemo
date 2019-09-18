package com.swpu.uchain.swaggerdemo.DTO;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @author；lzh
 * @Date:2019/8/18 10:17
 * @Descirption:
 */
@Data
public class RoleDTO {

    /**
     * 学生学号
     */
    @NotNull(message = "学生id不能为空")
    @ApiModelProperty("学生学号")
    private String stuId;

    /**
     * 权限身份
     */
    @NotNull(message = "授权权限值不能为空")
    @ApiModelProperty("授权值")
    private Integer role;
}
