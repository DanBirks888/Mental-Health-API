package com.API.MentalHealthAPI.model;

import com.API.MentalHealthAPI.model.experienceAttributes.Emotion;
import com.API.MentalHealthAPI.model.experienceAttributes.Location;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Experience")
public class Experience {

    private Emotion emotion;
    private Location location;

}
