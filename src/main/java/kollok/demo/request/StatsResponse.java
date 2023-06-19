package kollok.demo.request;

import javax.validation.constraints.NotEmpty;

public class StatsResponse {
    private int totalCaloriesBurned;
    private int totalCaloriesConsumed;
    private int totalPhysicalActivityDuration;
    private int totalSleepDuration;

    public int getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }

    public void setTotalCaloriesBurned(int totalCaloriesBurned) {
        this.totalCaloriesBurned = totalCaloriesBurned;
    }

    public int getTotalCaloriesConsumed() {
        return totalCaloriesConsumed;
    }

    public void setTotalCaloriesConsumed(int totalCaloriesConsumed) {
        this.totalCaloriesConsumed = totalCaloriesConsumed;
    }

    public int getTotalPhysicalActivityDuration() {
        return totalPhysicalActivityDuration;
    }

    public void setTotalPhysicalActivityDuration(int totalPhysicalActivityDuration) {
        this.totalPhysicalActivityDuration = totalPhysicalActivityDuration;
    }

    public int getTotalSleepDuration() {
        return totalSleepDuration;
    }

    public void setTotalSleepDuration(int totalSleepDuration) {
        this.totalSleepDuration = totalSleepDuration;
    }
}
