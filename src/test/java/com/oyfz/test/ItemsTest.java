package com.oyfz.test;


import com.oyfz.domain.Items;
import com.oyfz.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //dao测试
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
//
//        Items items = itemsDao.findById(1);
//        System.out.println(items.getName());

        //service测试
        ItemService itemService = ac.getBean(ItemService.class);
        //调用方法
        Items items = itemService.findById(1);
        System.out.println(items.getDetail());

    }
}
