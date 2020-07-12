package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(path="/all")
	public @ResponseBody Iterable<Users> getAllUsers() {
		return userRepository.findAll();
	}
}
