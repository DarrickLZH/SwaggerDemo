package com.swpu.uchain.swaggerdemo.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author；lzh
 * @Date:2019/8/18 10:41
 * @Descirption:
 */
@Data
public class LogInDTO {

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;
}
