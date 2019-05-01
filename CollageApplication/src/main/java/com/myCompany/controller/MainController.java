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
import com.myCompany.command.LoginCommand;
import com.myCompany.command.StudentRegisterCmd;
import com.myCompany.service.LoginService;

@Controller
public class MainController {
	@Autowired
	private LoginService service;

	@GetMapping("/welcome")
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	@GetMapping("/sinup")
	public String reg(@ModelAttribute("regusercmd") StudentRegisterCmd rcmd) {
		return "register";
	}

	@PostMapping("/sinup")
	public String registerUser(@ModelAttribute("regusercmd") StudentRegisterCmd cmd, Map<String, Object> map) {
		boolean result = cmd.getPhno() == 1234;
		if (result) {
			map.put("msg", "registration sucess");
			return "regSucc";
		} else {
			map.put("msg", "registration failed");
			return "register";
		}
	}

	@GetMapping("/login")
	public String displogin(@ModelAttribute("lcmd") LoginCommand cmd) {
		return "login";
	}

	@PostMapping("/login")
	public String checkLogin(@ModelAttribute("lcmd") LoginCommand cmd, Map<String, Object> map) {
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);

		Boolean resut = service.validUser(dto);
		if (resut) {
			return "login_succ";
		} else {
			map.put("msg", "invalied credentials please register or give correct details");
			return "login";
		}

	}
}