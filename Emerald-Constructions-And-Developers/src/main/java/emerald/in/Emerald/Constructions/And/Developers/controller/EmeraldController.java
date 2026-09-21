package emerald.in.Emerald.Constructions.And.Developers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class EmeraldController {
	@GetMapping("/index")
	public String homePage(Model model) {
		return "index";
	}

	@GetMapping("/aboutus")
	public String aboutUs(Model model) {
		return "aboutus";
	}

	@GetMapping("/services")
	public String services(Model model) {
		return "services";
	}

	@GetMapping("/gallery")
	public String gallery(Model model) {
		return "gallery";
	}

	@GetMapping("/contactus")
	public String contactUs(Model model) {
		return "contactus";
	}

	@GetMapping("/electricalwork")
	public String electricalworkPage(Model model) {
		return "electricalwork";
	}

	@GetMapping("/mechanicalfabrication")
	public String mechanicalfabricationPage(Model model) {
		return "mechanicalfabrication";
	}

	@GetMapping("/civilconstruction")
	public String civilConstructionpage(Model model) {
		return "civilconstruction";
	}

	@GetMapping("/interior")
	public String interiorpage(Model model) {
		return "interior";
	}
	@GetMapping("/painting")
	public String paintingPage(Model model) {
		return "painting";
	}
	@GetMapping("/servicespage")
	public String servicespage(Model model) {
		return "servicesPage";
	}
}
