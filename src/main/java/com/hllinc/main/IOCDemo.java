package com.hllinc.main;

import com.hllinc.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hongliang
 * @version 1.0
 * @date 2022/9/7 17:34
 */
public class IOCDemo {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
    IOCService iocService = context.getBean(IOCService.class);
    System.out.println(iocService.hello());
  }
}
