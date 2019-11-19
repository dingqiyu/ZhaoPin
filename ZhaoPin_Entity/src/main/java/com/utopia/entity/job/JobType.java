package com.utopia.entity.job;

import lombok.Data;

/**
 * @author Qiyu.D
 * @date 2019-11-19 20:57
 */
@Data
public class JobType {
    private int id;
    private String name;
    private int level;
    private int parent;
}
