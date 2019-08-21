package com.kgc.kd52.dao;

import com.kgc.kd52.pojo.Person;

import java.util.List;

/**
 * Created by jora on 2019/5/6.
 */
public interface PersonMapper {
    //查询所有
    List<Person> queryAllPers();

    //录入
    Integer addPerson(Person person);
}
