package main.controller;

import main.Modal.PostModal;
import main.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @Autowired
    private PostsService postService;
    @RequestMapping("/")
    public String getAllPosts(Model model) {
        ArrayList<PostModal> postsList = postService.getAllPosts();
        model.addAttribute("posts", postsList);
        return ("index");
    }

}
