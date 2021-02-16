package com.API.MentalHealthAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "User")
public class User {

    @Id
    private String email;
    private String password;
    private List<Experience> experiences;

}
