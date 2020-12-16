package main.controller;

import main.Modal.PostModal;
import main.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostsController {
    @Autowired
    private PostsService postService;

    @RequestMapping("posts")
    public String posts(Model model) {
        ArrayList<PostModal> singlePost = postService.getOnePost();
        model.addAttribute("posts",singlePost);
        return "posts";
    }

}
