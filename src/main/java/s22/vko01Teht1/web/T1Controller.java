package s22.vko01Teht1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class T1Controller {

	@RequestMapping("index")
	@ResponseBody
	public String palautaIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String palautaContact() {
		return "This is the contact page";
	}
}
