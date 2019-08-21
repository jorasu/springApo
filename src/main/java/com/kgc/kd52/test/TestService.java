package com.kgc.kd52.test;

import com.kgc.kd52.pojo.Person;
import com.kgc.kd52.service.PersonService;
import com.kgc.kd52.service.impl.PersonServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by jora on 2019/5/6.
 */
public class TestService {
    public static void main(String[] args) {
        //加载spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过spring的bean组件获取业务访问层对象
        PersonService p=(PersonService)ac.getBean("personServiceImpl");
        //查询所有的
        List<Person> personList=p.search();
        personList.forEach(c-> System.out.println(c));

        System.out.println("**********************************");
        //调用录入的
        System.out.println("录入用户信息受影响的行数："+p.savePerson(new Person()));
    }
}
