package com.pkrm.service;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pkrm.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/test-config.xml")
public class RegisterFormServiceIntegrationTest {
	
	@Autowired
	private RegisterFormService service;
	
	@Test
	public void firstTest(){
		User user = service.retrieveUserDetails("1111");
		assertNotNull(user);
		assertNotNull(user.getFirstName());
		
	}

}