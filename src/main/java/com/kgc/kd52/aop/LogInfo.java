package com.kgc.kd52.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * Created by jora on 2019/5/6.
 * 公共的类组件信息
 *   定义日志文件
 */
public class LogInfo {
    //定义给指定的业务逻辑功能添加日志文件信息
    //定义日志文件信息
    private Logger logger=Logger.getLogger(LogInfo.class);

    //定义什么时候添加日志文件信息的通知方法
    public void beforeLog(JoinPoint jp){
        logger.info("获取调用的当前对象："+jp.getTarget()+","+
            "当前调用对象的方法名称："+jp.getSignature()+","+
            "获取当前调用的方法参数信息："+ Arrays.toString(jp.getArgs()));
        System.out.println("************************调用前置通知*****************************");
    }



}
