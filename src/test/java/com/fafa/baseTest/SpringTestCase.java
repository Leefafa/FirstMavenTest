package com.fafa.baseTest;

import org.junit.runner.RunWith;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
/**
 *  
 * @author fafa
 * @data Jan 22, 2017
 * @time 8:49:26 PM
 */
//指定bean注入的配置文件  
@ContextConfiguration(locations = { "classpath:application.xml" })  
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)  
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests{  
    protected Logger logger = LoggerFactory.getLogger(getClass());  
}  