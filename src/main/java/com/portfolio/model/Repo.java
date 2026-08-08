package com.portfolio.model;

public class Repo {

    private String name;
    private String html_url;
    private String description;
    private int stargazers_count;
    private String language;

    public Repo() {}

    public String getName() {
        return name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getDescription() {
        return description;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public String getLanguage() {
        return language;
    }
}