package cn.bibi.order.entity;

import lombok.Data;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-10-01 22:03
 **/
@Data
public class Class {
    private String className;
    private int classId;

    public Class() {
    }

    public Class(String className, int classId) {
        this.className = className;
        this.classId = classId;
    }
}
