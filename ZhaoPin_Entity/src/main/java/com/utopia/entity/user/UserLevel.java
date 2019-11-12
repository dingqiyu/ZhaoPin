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
public class UserLevel {

    private Integer id;

    /**
     * 会员id
     */
    private Integer uid;

    /**
     * 会员等级 1最低 
     */
    private Integer level;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 黑铁 青铜 白银 黄金 铂金 钻石 荣耀
     */
    private String levelmsg;
}