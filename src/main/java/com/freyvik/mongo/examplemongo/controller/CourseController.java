package com.freyvik.mongo.examplemongo.controller;

import com.freyvik.mongo.examplemongo.entity.Course;
import com.freyvik.mongo.examplemongo.repository.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping("/course")
    public String saveCourse(@RequestBody Course course) {
        courseRepository.save(course);

        return String.format("Course %s saved", course.getName());
    }

    @GetMapping("/course")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
