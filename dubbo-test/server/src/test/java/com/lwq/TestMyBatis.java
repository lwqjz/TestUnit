package com.lwq;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.IStudentDao;
import com.cn.hnust.pojo.Student;
import com.cn.hnust.service.StudentService;


//@Transactional  
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestMyBatis {
	// private static Logger logger = Logger.getLogger(TestMyBatis.class);
	// private ApplicationContext ac = null;
	@Resource
	StudentService studentService;
	@Resource
	private IStudentDao studentDao;
	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
//		Student stu = studentDao.selectByPrimaryKey(11);
//		System.out.println(stu.getStu_name());
		// User user = userService.getUserById(1);
		// // System.out.println(user.getUserName());
		// // logger.info("值："+user.getUserName());
		// logger.info(JSON.toJSONString(user));
		
//		Student stu = new Student();
//		stu.setId(12);
//		stu.setAge(30);
//		stu.setGender(10);
//		stu.setStu_name("黎明");
//		studentService.insert(stu);
		
		Student stu2 = studentDao.selectByPrimaryKey(12);
		System.out.println(stu2.getStu_name());
		
		
	}
}