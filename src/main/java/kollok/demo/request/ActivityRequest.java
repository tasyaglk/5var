package kollok.demo.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class ActivityRequest {
    @NotEmpty(message = "Activity must be not empty")
    private String activityType;
    @Positive(message = "Time must be a positive number")
    private int durationInMinutes;
    @Positive(message = "Calories must be a positive number")
    private int caloriesBurned;


    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
}
