package com.cn.hnust.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IStudentDao;
import com.cn.hnust.pojo.Student;

@Service
public class StudentService {

	@Resource
	private IStudentDao studentDao;

	public Student getStudentById(Integer studentId) {
		return this.studentDao.selectByPrimaryKey(studentId);
	}

	public int insert(Student student) {
		return this.studentDao.insert(student);
	}
}