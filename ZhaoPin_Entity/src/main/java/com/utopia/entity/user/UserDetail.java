package com.utopia.entity.user;

import java.util.Date;
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
public class UserDetail {
    private Integer id;
    /**
     * 会员id
     */
    private Integer uid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 1女 2男 3第三性别
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * IP地址
     */
    private String ipaddr;

    /**
     * 住址
     */
    private String address;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date modtime;
}