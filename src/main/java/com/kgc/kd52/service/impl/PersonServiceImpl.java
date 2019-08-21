package com.kgc.kd52.service.impl;

import com.kgc.kd52.dao.PersonMapper;
import com.kgc.kd52.pojo.Person;
import com.kgc.kd52.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jora on 2019/5/6.
 * @Service: 用来标识业务访问层
 * 默认就相当于
 *     <bean id="personserviceImpl" class="com.kgc.kd52.service.impl.PersonServiceImpl">

        </bean>
 */
@Service
public class PersonServiceImpl implements PersonService {
    //以面向bean组件创建数据访问层对象，从而达到层与层之间的松耦合
    /*
    * @Autowired:
    * 默认就相当于
    *<property name="mapper" ref="personMapper"/>
    * */
    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Person> search() {
        return mapper.queryAllPers();
    }

    @Override
    public Integer savePerson(Person p) {
        return mapper.addPerson(p);
    }
}
