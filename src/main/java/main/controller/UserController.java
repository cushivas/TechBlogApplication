package main.controller;

import main.Modal.PostModal;
import main.Modal.User;
import main.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private PostsService postService;

    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";
    }
    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginUser(User user) {
        return "redirect:/posts";
    }

    @RequestMapping(value = "users/logout", method = RequestMethod.POST)
    public String logoutUser(Model model) {
        ArrayList<PostModal> postsList = postService.getAllPosts();
        model.addAttribute("posts", postsList);
        return ("index");
    }


}
