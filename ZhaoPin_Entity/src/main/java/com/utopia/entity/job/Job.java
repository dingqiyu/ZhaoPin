package com.utopia.entity.job;

import lombok.Data;

/**
 * @author Qiyu.D
 * @date 2019-11-19 20:57
 */
@Data
public class Job {
    private int id;
    private String no;
    private int companyId;
    private int jtId;
    private String name;
    private int flag;
    private String spuspace;

}
