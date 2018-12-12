package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping("register")
	public ModelAndView registerCheck(HttpServletRequest rq,HttpServletResponse rs) {
		//check name,address,age
		if(rq.getParameter("name").equals("")||rq.getParameter("address").equals("")||rq.getParameter("age").equals("")) {
			return new ModelAndView("error","msg","Empty field(s).");
		}
		int id=Integer.parseInt(rq.getParameter("id"));
		String name=rq.getParameter("name");
		String email=rq.getParameter("email");
		String phone=rq.getParameter("phone");
		int age=Integer.parseInt(rq.getParameter("age"));
		String gender=rq.getParameter("gender");
		String address=rq.getParameter("address");
		
		ModelAndView m=new ModelAndView("home");
		
		m.addObject("id",id);
		m.addObject("name",name);
		m.addObject("email",email);
		m.addObject("phone",phone);
		m.addObject("age",age);
		m.addObject("gender",gender);
		m.addObject("address",address);
		return m;
	}
}
