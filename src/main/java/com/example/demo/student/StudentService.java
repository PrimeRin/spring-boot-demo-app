package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Sonam Dorji",
                        "sonam12@gmail.com",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 22)
                )
        );
    }
}
