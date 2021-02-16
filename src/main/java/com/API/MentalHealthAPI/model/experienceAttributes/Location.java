package com.API.MentalHealthAPI.model.experienceAttributes;

import com.API.MentalHealthAPI.model.experienceAttributes.enums.Activity;
import com.API.MentalHealthAPI.model.experienceAttributes.enums.Context;
import com.API.MentalHealthAPI.model.experienceAttributes.enums.Time;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private Context context;
    private Activity activity;
    private Time time;

    public Location(Context context, Activity activity, Time time) {
        this.context = context;
        this.activity = activity;
        this.time = time;
    }
}
