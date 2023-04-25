package com.freyvik.mongo.examplemongo.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CourseTest {

    @Test
    @DisplayName("Course constructor")
    void shouldCreateCourseWithBuilder() {
        Course course = Course.builder()
                .id(1L)
                .name("Math")
                .classroom("1A")
                .build();

        assertNotNull(course);
    }
}