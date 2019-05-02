package com.myCompany.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myCompany.DTO.StudentDTO;
import com.myCompany.DTO.StudentRegisterDTO;
import com.myCompany.command.LoginCommand;
import com.myCompany.command.StudentRegisterCmd;
import com.myCompany.service.LoginService;

@Controller
public class MainController {
	@Autowired
	private  LoginService service;
	
	@GetMapping("/welcome")
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	@GetMapping("sinup")
	public String reg(@ModelAttribute("regusercmd") StudentRegisterCmd cmd) {
		return "register";
	}

	@PostMapping("sinup")
	public String registerusr(@ModelAttribute("regusercmd") StudentRegisterCmd cmd,Map<String, Object> map) {
		String result=null;
		StudentRegisterDTO dto=null;
		dto=new StudentRegisterDTO();
		BeanUtils.copyProperties(cmd,dto);
		System.out.println(dto);
		result=service.insertData(dto);
		map.put("result", result);
		System.out.println(result);
		
		return "register";
		
	}

	@GetMapping("/login")
	public String displogin(@ModelAttribute("lcmd") LoginCommand cmd) {
		return "login";
	}

	@PostMapping("/login")
	public String checkLogin(@ModelAttribute("lcmd") LoginCommand cmd,Map<String, Object> map) {
		StudentDTO dto=new  StudentDTO();
		BeanUtils.copyProperties(cmd,dto);
		
		Boolean resut = service.validUser(dto);
		if (resut) {
			return "login_succ";
		} else {
			map.put("msg", "invalied credentials please register or give correct details");
			return "login";
		}

	}
}