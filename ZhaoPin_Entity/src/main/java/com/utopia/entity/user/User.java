package com.utopia.entity.user;

import lombok.Data;



/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-11-12
 */
@Data
public class User {
    private Integer id;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 密文密码
     */
    private String password;
    /**
     * 标记位：1有效 2临时无效 3注销
     */
    private Integer flag;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 登录用户名
     */
    private String account;
}