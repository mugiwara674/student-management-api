package com.example.studentapi.dto;

public class StudentPatchDTO {
    private String name;
    private String gender;

    public StudentPatchDTO() {
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;

    }

    public String getName() {
        return name;
    }

}
