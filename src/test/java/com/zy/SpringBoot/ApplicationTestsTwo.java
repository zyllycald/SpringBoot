package com.zy.SpringBoot;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zy.SpringBoot.entity.EntityOne;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTestsTwo {
	private static final Log log = LogFactory.getLog(ApplicationTestsTwo.class);
	
	@Autowired
	private EntityOne entityOne;
	
	@Test
	public void test() throws Exception {
		Assert.assertEquals("张三", entityOne.getName());
		Assert.assertEquals("男", entityOne.getType());
		Assert.assertEquals("张三是男的", entityOne.getPeople());
		
		
		log.info("随机数测试：");
		log.info("随机字符串 : " + entityOne.getStringTest());
		log.info("随机int : " + entityOne.getIntTest());
		log.info("随机long : " + entityOne.getLongTest());
		log.info("随机10以下 : " + entityOne.getIntTestTwo());
		log.info("随机10-20 : " + entityOne.getIntTestThree());
	}

}
