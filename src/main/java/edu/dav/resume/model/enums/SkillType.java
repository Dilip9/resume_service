package edu.dav.resume.model.enums;

public enum SkillType {
    
    FRONTEND("Frontend"),
    BACKEND("Backend"),
    TOOLS("Tools"),
    UI("UI/UX"),
    DATABASE("Database"),
    FRAMEWORK("Framework"),
    CLOUD("Cloud"),
    DEVOPS("DevOps");

    private final String type;

    SkillType(String frontend) {
        this.type = frontend;
    }
}
