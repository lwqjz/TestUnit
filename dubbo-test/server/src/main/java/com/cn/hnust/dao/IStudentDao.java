package com.cn.hnust.dao;

import com.cn.hnust.pojo.Student;

public interface IStudentDao {
	// int deleteByPrimaryKey(Integer id);
	//
	// int insert(Student record);
	//
	// int insertSelective(Student record);
	//
	// int updateByPrimaryKeySelective(Student record);
	//
	// int updateByPrimaryKey(Student record);

	Student selectByPrimaryKey(Integer id);

	int insert(Student record);
}