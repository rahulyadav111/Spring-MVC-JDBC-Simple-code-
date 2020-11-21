package com.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;
import model.UserDao;

@Controller
public class ControllerDemo
{
	//DriverManagerDataSource obj=
	//DispatcherServlet obj=
	//InternalResourceViewResolver obj=
	@RequestMapping("/home")
	public String view()
	{
		return "home";
	}
	@RequestMapping("/register")
	public String view1(Model m)
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User obj=app.getBean("info",User.class);
		m.addAttribute("bean",obj );
		return "register";
	}
	@RequestMapping(value="/stor",method=RequestMethod.POST)
	public String view2(@ModelAttribute("bean") User u)
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao obj=con.getBean("dao",UserDao.class);
		obj.save(u);
		
		return "success";
	}
	@RequestMapping("/display")
	public String view3(Model m)
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao obj=con.getBean("dao",UserDao.class);
		List list=obj.display();
		m.addAttribute("list", list);
		return "records";
		
	}
	

}
