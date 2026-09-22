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
	@GetMapping("/servicesPage")
	public String servicesPage(Model model) {
		return "servicesPage";
	}

	@GetMapping("/gallery")
	public String gallery(Model model) {
		return "gallery";
	}

	@GetMapping("/contactus")
	public String contactUs(Model model) {
		return "contactus";
	}

	@GetMapping("/realestate")
	public String realestatePage(Model model) {
		return "realestate";
	}

	@GetMapping("/plotsandlands")
	public String plotsandlandsPage(Model model) {
		return "plotsandlands";
	}

	@GetMapping("/architecture")
	public String architecturepage(Model model) {
		return "architecture";
	}

	@GetMapping("/residentalconstruction")
	public String residentalconstructionpage(Model model) {
		return "residentalconstruction";
	}
	@GetMapping("/commercialconstruction")
	public String commercialconstructionPage(Model model) {
		return "commercialconstruction";
	}
	@GetMapping("/industrialconstruction")
	public String industrialconstructionpage(Model model) {
		return "industrialconstruction";
	}
	@GetMapping("/interior")
	public String interiorPage(Model model) {
		return "interior";
	}
}
