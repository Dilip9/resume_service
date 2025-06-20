package edu.dav.resume.model.enums;

public enum ContactType {

    EMAIL("Email"),
    PHONE("Phone"),
    LINKEDIN("LinkedIn"),
    GITHUB("GitHub"),
    TWITTER("Twitter"),
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram");

    private final String displayName;

    ContactType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
