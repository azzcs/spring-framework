package com.azzcs.factory;

import com.azzcs.po.Student;

/**
 * @Author: wzg
 * @Date: 2020/10/28 11:37 上午
 */
public class TestFactory {
	private static Student  student = new Student();

	private TestFactory() {
	}

	public static Student createStudent(){
		return student;
	}
}
