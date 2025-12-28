package com.example.studentapi.service;

import java.util.Optional;

import com.example.studentapi.dto.StudentDTO;
import com.example.studentapi.dto.StudentPatchDTO;
import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public StudentDTO patchStudent(int id, StudentPatchDTO st) {
        Student ex = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        if (st.getName() != null) {
            ex.setName(st.getName());
        }
        if (st.getGender() != null) {
            ex.setGender(st.getGender());
        }
        return entityToDTO(repo.save(ex));
    }

    public Student dtoToEntity(StudentDTO dt) {
        Student st = new Student();
        st.setId(dt.getId());
        st.setName(dt.getName());
        st.setGender(dt.getGender());
        return st;
    }

    public StudentDTO entityToDTO(Student st) {
        StudentDTO dt = new StudentDTO();
        dt.setId(st.getId());
        dt.setName(st.getName());
        dt.setGender(st.getGender());
        return dt;
    }

    public StudentDTO savStudent(StudentDTO st) {
        Student st1 = new Student();
        st1.setId(st.getId());
        st1.setGender(st.getGender());
        st1.setName(st.getName());
        Student saved = repo.save(st1);
        StudentDTO response = new StudentDTO();
        response.setGender(saved.getGender());
        response.setId(saved.getId());
        response.setName(saved.getName());
        return response;
    }

    public Student updaStudent(int id, Student st) {
        Optional<Student> op = repo.findById(id);
        if (op.isEmpty()) {
            return null;
        }
        Student ex = op.get();
        ex.setName(st.getName());
        ex.setGender(st.getGender());

        return repo.save(ex);

    }

    public StudentDTO getStudent(int id) {
        Student st = repo.findById(id).orElse(null);
        if (st == null)
            return null;
        StudentDTO dt = new StudentDTO();
        dt.setGender(st.getGender());
        dt.setId(st.getId());
        dt.setName(st.getName());
        return dt;

    }

}
