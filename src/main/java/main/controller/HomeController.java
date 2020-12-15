package main.controller;

import main.Modal.PostModal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model) {
        PostModal post1 = new PostModal();
        post1.setTitle("Post1");
        post1.setBody("Post 1 body");
        post1.setDate(new Date());

        PostModal post2 = new PostModal();
        post2.setTitle("Post2");
        post2.setBody("Post 2 body");
        post2.setDate(new Date());

        PostModal post3 = new PostModal();
        post3.setTitle("Post3");
        post3.setBody("Post 3 body");
        post3.setDate(new Date());

        ArrayList<PostModal> postsList = new ArrayList<>();
        postsList.add(post1);
        postsList.add(post2);
        postsList.add(post3);

        model.addAttribute("posts", postsList);
        return ("index");
    }

}
