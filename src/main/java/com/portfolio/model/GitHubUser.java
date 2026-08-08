package com.portfolio.model;

public class GitHubUser {

    private String login;
    private String avatar_url;
    private String html_url;
    private String bio;
    private int followers;
    private int following;
    private int public_repos;

    public GitHubUser() {}

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getBio() {
        return bio;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public int getPublic_repos() {
        return public_repos;
    }
}
