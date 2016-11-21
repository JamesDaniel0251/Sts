package com.lee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/Lee_Trade")
	public String index(Model model) {
		model.addAttribute("name", "SpringBlog from Millky");
		return "/veiws/login";
	}
}
