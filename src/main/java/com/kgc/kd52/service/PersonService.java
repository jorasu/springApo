package com.kgc.kd52.service;

import com.kgc.kd52.pojo.Person;

import java.util.List;

/**
 * Created by jora on 2019/5/6.
 */
public interface PersonService {
    //搜索用户信息
    List<Person> search();

    //录入
    Integer savePerson(Person person);

}
