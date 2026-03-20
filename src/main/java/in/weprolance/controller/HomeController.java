package in.weprolance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("firstName", "Vishnu");
        model.addAttribute("lastName", "Bovilla");

        return "home";
    }

    @GetMapping("/index")
    public String indexPage(ModelMap model) {
        model.addAttribute("title", "Index");
        model.addAttribute("firstName", "Harini");
        model.addAttribute("lastName", "Bovilla");

        return "index";
    }

    @GetMapping("/account")
    public ModelAndView profilePage() {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("title", "Profile");
        model.put("firstName", "Harini");
        model.put("lastName", "Bovilla");

        ModelAndView profile = new ModelAndView("profile", model);

//        ModelAndView profile = new ModelAndView("profile");
//        profile.addObject("title", "Profile");
//        profile.addObject("firstName", "Harini");
//        profile.addObject("lastName", "Bovilla");
        return profile;
    }
}
