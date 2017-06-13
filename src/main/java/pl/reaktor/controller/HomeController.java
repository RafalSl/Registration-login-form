package pl.reaktor.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.model.NewMember;
import pl.reaktor.repository.UserRepository;
import pl.reaktor.service.UserService;

@Controller
public class HomeController {
	private UserService userService;
	private UserRepository userRepository;

	@RequestMapping("/")
	public String home(Model model) {
		return "index";
	}

	@RequestMapping("/start")
	public String start (Model model) {
		return "index";
	}
	
/*	@RequestMapping("/registration")
	public String rejestracja(Model model) {
		return "registration";
	}*/
	
	@RequestMapping("/login")
	public String logowanie(Model model) {
		return "login";
	}
	
	@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
	
	@Autowired
    public HomeController(UserRepository userRepo) {
        this.userRepository = userRepo;
    }
	
	@GetMapping("/registration")
	public String rejestracjaGet(NewMember newMember, Model model) {
		model.addAttribute("helloMessage", "Zarejestruj się");
		model.addAttribute(newMember);
		return "registration";
	}
	
	@PostMapping("/registration")
	public String rejestracjaPost(@Valid NewMember newMember, BindingResult result, Model model) {
		model.addAttribute("helloMessage", "Błędy w formularzu");
		model.addAttribute(newMember);
		if(result.hasErrors())
            return "registration";
        else {            
            userService.addNewMember(newMember);
            return "index";
        }

	}
}
