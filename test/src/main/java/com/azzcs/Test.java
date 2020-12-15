package com.azzcs;

import com.azzcs.po.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * @Author: wzg
 * @Date: 2020/10/27 10:13 上午
 */
public class Test {


	public static void main(String[] args) {
		System.out.println(010);
		//解析application_context.xml文件 , 生成管理相应的Bean对象        
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//getBean : 参数即为spring配置文件中bean的id
		Student student = context.getBean("student",Student.class);
		System.out.println(student);

	}
}
