package com.fred.sandboxcoursesservice.course;

import java.util.Arrays;
import java.util.List;

import com.fred.sandboxcoursesservice.studants.Studant;
import com.fred.sandboxcoursesservice.studants.StudantClient;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseService {
    
    private StudantClient studantClient;

    public List<Course> findCourses(){
        List<Studant> studants =  studantClient.getStudants(1);
        return Arrays.asList(new Course(1, "Sistemas de Informação", studants));
    }
}