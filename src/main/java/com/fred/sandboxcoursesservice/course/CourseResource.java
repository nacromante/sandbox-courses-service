package com.fred.sandboxcoursesservice.course;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class CourseResource {

    private CourseService courseService;
    
    @GetMapping
    public ResponseEntity<List<Course>> findCourses(){
        return ResponseEntity.ok(courseService.findCourses());
    }
}