//package com.portfolio.service;
//
//import com.portfolio.model.Repo;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class GitHubService {
//
//    private static final String GITHUB_API =
//            "https://api.github.com/users/khushnumaparween/repos";
//
//    public List<Repo> getRepos() {
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        Repo[] repos = restTemplate.getForObject(GITHUB_API, Repo[].class);
//
//        return Arrays.asList(repos);
//    }
//}


package com.portfolio.service;

import com.portfolio.model.Repo;
import com.portfolio.model.GitHubUser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class GitHubService {

    private static final String USERNAME = "khushnumaparween";

    private static final String REPOS_API =
            "https://api.github.com/users/" + USERNAME + "/repos";

    private static final String USER_API =
            "https://api.github.com/users/" + USERNAME;

    private final RestTemplate restTemplate = new RestTemplate();

    // GET ALL REPOS
    public List<Repo> getRepos() {
        try {
            Repo[] repos = restTemplate.getForObject(REPOS_API, Repo[].class);

            if (repos == null) return Collections.emptyList();

            return Arrays.asList(repos);

        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    // GET USER PROFILE (HEADER CARD)
    public GitHubUser getUserProfile() {
        try {
            return restTemplate.getForObject(USER_API, GitHubUser.class);

        } catch (Exception e) {
            return new GitHubUser();
        }
    }
}