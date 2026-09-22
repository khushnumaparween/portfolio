package com.portfolio.controller;

import com.portfolio.service.GitHubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final GitHubService gitHubService;

    public HomeController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }


    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/about")
    public String about() {
        return "about";
    }


    @GetMapping("/skills")
    public String skills() {
        return "skills";
    }


    @GetMapping("/projects")
    public String projects(Model model) {

        model.addAttribute(
                "repos",
                gitHubService.getRepos()
        );

        model.addAttribute(
                "user",
                gitHubService.getUserProfile()
        );

        return "projects";
    }


    @GetMapping("/experience")
    public String experience() {
        return "experience";
    }


    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }


    @GetMapping("/resume")
    public String resume() {
        return "redirect:/resume/Khushnuma_Parween_Portfolio_resume.pdf";
    }

}

