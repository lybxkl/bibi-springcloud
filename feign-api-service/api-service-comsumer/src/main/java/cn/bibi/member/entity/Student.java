package cn.bibi.member.entity;

import lombok.Data;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-10-01 22:03
 **/
@Data
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
