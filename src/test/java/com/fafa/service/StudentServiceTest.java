package com.fafa.service;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  

import com.fafa.baseTest.SpringTestCase;  
import com.fafa.dao.StudentMapper;
import com.fafa.domain.Student;
  
/**
 * 
 * @author fafa
 * @data Jan 22, 2017
 * @time 10:12:33 PM
 */
public class StudentServiceTest extends SpringTestCase {  
    @Autowired  
    private StudentMapper studentMapper;  
    Logger logger = Logger.getLogger(StudentServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        Student student = studentMapper.selectByPrimaryKey("1");  
        logger.info("查询结果" + student.toString());  
        while (student.getStudentId()=="1") {
        	System.out.println("删除学号为1的。。。");
        	studentMapper.deleteByPrimaryKey(student.getStudentId());
		}
    }
}  
