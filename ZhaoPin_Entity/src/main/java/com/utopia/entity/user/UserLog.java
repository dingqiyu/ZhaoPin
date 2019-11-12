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
public class UserLog {
    private Integer id;
    /**
     * 会员id
     */
    private Integer uid;

    /**
     * 日志内容
     */
    private String info;

    /**
     * 时间
     */
    private Date ctime;

    /**
     * 标记位：1注册 2登录 3修改资料
     */
    private Integer flag;

    /**
     * 操作的IP地址
     */
    private String ipaddr;

    public UserLog (int flag,String info,String ipaddr,int uid){
        this.flag=flag;
        this.info=info;
        this.ipaddr=ipaddr;
        this.uid=uid;
    }
}