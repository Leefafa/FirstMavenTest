package com.fafa.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  


import com.fafa.dao.StudentMapper;  
import com.fafa.domain.Student;  
  
/**
 *  
 * @author fafa
 * @data Jan 22, 2017
 * @time 9:37:29 PM
 */
@Service
public class StudentServiceImpl implements StudentService{  
    @Autowired  
    private StudentMapper studentMapper;  
  
    public Student selectByPrimaryKey(String userId) {  
        return studentMapper.selectByPrimaryKey(userId);  
    }
  
} 
