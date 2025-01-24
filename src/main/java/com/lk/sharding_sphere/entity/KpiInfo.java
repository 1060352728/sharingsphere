package com.lk.sharding_sphere.entity;

import lombok.Data;

@Data
public class KpiInfo {
    private int id;

    private int taskId;

    private int neId;

    private String muId;

    private String mcId;

    private int period;

    private String time;

    private String value;
}
