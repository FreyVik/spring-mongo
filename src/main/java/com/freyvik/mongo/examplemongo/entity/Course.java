package com.freyvik.mongo.examplemongo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Document(collection = "Course")
public class Course {
    @Id
    Long id;

    String name;

    String classroom;
}
