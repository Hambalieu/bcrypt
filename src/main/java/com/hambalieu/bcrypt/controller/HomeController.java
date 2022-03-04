package com.hambalieu.bcrypt.controller;

import com.hambalieu.bcrypt.model.Posts;
import com.hambalieu.bcrypt.model.SiteUser;
import com.hambalieu.bcrypt.repository.PostsRepository;
import com.hambalieu.bcrypt.repository.SiteUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @Autowired
    SiteUserRepository siteUserRepository;
    @Autowired
    PostsRepository postsRepository;


    @GetMapping("/home/{username}")
    public String getHomepage(@PathVariable String username, Model m) {
        SiteUser siteUserPage = siteUserRepository.findByUsername(username);
        m.addAttribute("username", username.toUpperCase());
        m.addAttribute("siteUser", siteUserPage);
        m.addAttribute("posts", siteUserPage.getPostsOfThisUser());
        return "home.html";
    }

    @PostMapping("/add-post")
    public RedirectView addPost(long siteUserId, String text) {
        SiteUser postsByUser = siteUserRepository.getById(siteUserId);
        Posts postsToAdd = new Posts(text);
        postsToAdd.setPostsOfUser(postsByUser);
        postsRepository.save(postsToAdd);
        String username = postsByUser.getUsername();

        return new RedirectView("/home/" + username);

    }
}