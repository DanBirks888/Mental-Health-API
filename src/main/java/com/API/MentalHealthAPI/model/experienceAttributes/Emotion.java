package com.API.MentalHealthAPI.model.experienceAttributes;

import com.API.MentalHealthAPI.model.experienceAttributes.enums.Feelings;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emotion {

    private Feelings feelings;
    private int intensity;
    private boolean actedUpon;

    public Emotion(Feelings feelings, int intensity, boolean actedUpon) {
        this.feelings = feelings;
        this.intensity = intensity;
        this.actedUpon = actedUpon;
    }
}
