package main.services;

import main.Modal.PostModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostsService {
    public ArrayList<PostModal> getAllPosts() {

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
        return postsList;
    }

    public ArrayList<PostModal> getOnePost() {
        PostModal post1 = new PostModal();
        post1.setTitle("User Post 1");
        post1.setBody("User Post 1 body");
        post1.setDate(new Date());

        ArrayList<PostModal> postsList = new ArrayList<>();
        postsList.add(post1);
        return postsList;
    }

}
