package com.example.studentapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StudentDTO {
    @NotNull(message = "Id is required")
    private Integer id;
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "gender is required")
    private String gender;

    public StudentDTO() {

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
