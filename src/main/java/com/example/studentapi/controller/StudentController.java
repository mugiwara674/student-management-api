package com.example.studentapi.controller;

import com.example.studentapi.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapi.dto.StudentDTO;
import com.example.studentapi.model.Student;

@RestController
public class StudentController {
    private final StudentService serv;

    public StudentController(StudentService srv) {
        serv = srv;
    }

    @PostMapping("/student/save")
    public ResponseEntity<StudentDTO> savStudent(@Valid @RequestBody StudentDTO st) {
        StudentDTO saved = serv.savStudent(st);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentDTO> savStudent(@PathVariable int id) {
        StudentDTO dto = serv.getStudent(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

}