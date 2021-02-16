package com.API.MentalHealthAPI.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DocumentedExperience")
public class DocumentedExperience {

   private enum feelings {
        POSITIVE,
        STRESSED,
        DEPRESSED,
        ANXIOUS,
        FEAR,
        ANGRY,
    }

    private enum location {
        WORK,
        SOCIAL,


    }

}
