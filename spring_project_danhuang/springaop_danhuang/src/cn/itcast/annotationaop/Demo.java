package cn.itcast.annotationaop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/annotationaop/applicationContext.xml")
public class Demo
{
	@Resource(name="userServiceTarget")
	private UserService us;
	@Test
	public void fun1()
	{
		us.save();
	}
}
