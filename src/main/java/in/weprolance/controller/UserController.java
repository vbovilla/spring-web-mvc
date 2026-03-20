package in.weprolance.controller;

import in.weprolance.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/user/{userId}/album/{albumId}")
    public ModelAndView getUserAlbum(@PathVariable("userId") String userId,
                                     @PathVariable("albumId") String albumId) {
        ModelAndView userAlbum = new ModelAndView("album");
        userAlbum.addObject("userId", userId);
        userAlbum.addObject("albumId", albumId);

        return userAlbum;
    }

    @PostMapping("/signup")
    public ModelAndView userSignup(@ModelAttribute User user) {
        ModelAndView userRegistration = new ModelAndView("profile-summary");
        userRegistration.addObject("user", user);
        return userRegistration;
    }

    @GetMapping("/signup")
    public String signUp() {
        return "signup";
    }
}
