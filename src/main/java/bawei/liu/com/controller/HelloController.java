package bawei.liu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = {"","/","hello"})
	public String Hello() {
		return "hello";
	}
}
