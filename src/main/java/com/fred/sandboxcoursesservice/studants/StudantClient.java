package com.fred.sandboxcoursesservice.studants;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("${services.studants.url}")
public interface StudantClient {
    
    @GetMapping("/course/{course-id}")
    public List<Studant> getStudants(@PathVariable("course-id") int courseId);
}