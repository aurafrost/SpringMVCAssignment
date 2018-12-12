package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("login")
	public ModelAndView loginCheck(HttpServletRequest rq,HttpServletResponse rs) {
		String name=rq.getParameter("username");
		String pw=rq.getParameter("password");
		
		if(name.equals("admin")&&pw.equals("admin")) {
			return new ModelAndView("../../registration","msg",name);
		}
		else {
			return new ModelAndView("error","msg","invalid username or password");
		}
	}
}
