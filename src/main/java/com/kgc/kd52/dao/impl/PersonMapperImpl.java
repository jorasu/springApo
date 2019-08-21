package com.kgc.kd52.dao.impl;

import com.kgc.kd52.dao.PersonMapper;
import com.kgc.kd52.pojo.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jora on 2019/5/6.
 *    @Repository: 用来标识数据访问层
 *    默认相当于
 *    <bean id="personMapperImpl" class="com.kgc.kd52.dao.impl.PersonMapperImpl"></bean>
 */
@Repository
public class PersonMapperImpl implements PersonMapper {
    @Override
    public List<Person> queryAllPers() {
        List<Person> personList=new ArrayList<Person>();
        Person p=new Person();
        p.setPid(100011);
        p.setPname("金刚");
        personList.add(p);
        return personList;
    }

    @Override
    public Integer addPerson(Person person) {
        return 10;
    }
}
