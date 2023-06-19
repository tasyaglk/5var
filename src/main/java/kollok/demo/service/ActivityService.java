package kollok.demo.service;

import org.springframework.stereotype.Service;
import kollok.demo.request.ActivityRequest;

@Service
public class ActivityService {

    public void addActivity(ActivityRequest request) {
        String activityType = request.getActivityType();
        int durationInMinutes = request.getDurationInMinutes();
        int caloriesBurned = request.getCaloriesBurned();


        request.setActivityType("emae");
        request.setDurationInMinutes(20);
        request.setCaloriesBurned(100);
        System.out.println("Activity Type: " + activityType);
        System.out.println("Duration (minutes): " + durationInMinutes);
        System.out.println("Calories Burned: " + caloriesBurned);
    }
}
