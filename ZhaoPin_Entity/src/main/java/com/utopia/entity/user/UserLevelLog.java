package com.utopia.entity.user;


import lombok.Data;

import java.util.Date;




/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-11-12
 */
@Data
public class UserLevelLog {
    private Integer id;

    /**
     * 会员等级id
     */
    private Integer ulid;

    /**
     * 原因
     */
    private String info;

    /**
     * U值
     */
    private Integer score;

    /**
     * 创建时间
     */
    private Date ctime;
}