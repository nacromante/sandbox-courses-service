package com.fred.sandboxcoursesservice.course;

import java.util.List;

import com.fred.sandboxcoursesservice.studants.Studant;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Course {
    private int id;
    private String description;
    private List<Studant> studants;

}