package com.freyvik.mongo.examplemongo.repository;

import com.freyvik.mongo.examplemongo.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, Long> {

    public Course findByClassroom(String classroom);

    public List<Course> findByName(String name);
}
