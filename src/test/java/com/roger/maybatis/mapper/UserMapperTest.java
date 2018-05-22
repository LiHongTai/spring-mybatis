package com.roger.maybatis.mapper;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.roger.maybatis.BaseTestSuitCase;
import com.roger.mybatis.entity.User;
import com.roger.mybatis.mapper.UserMapper;

public class UserMapperTest extends BaseTestSuitCase {

	@Autowired
	private UserMapper mapper;
	
	@Test
	public void testSave() {
		User user = new User();
		user.setName("Mary");
		user.setSalary(120D);
		user.setBirthday(LocalDate.parse("1988-06-24"));
		mapper.save(user);
	}
}
