package com.API.MentalHealthAPI.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "User")
public class User {

    @Id
    private String email;
    private String password;
    private List<DocumentedExperience> documentedExperienceList;

}
