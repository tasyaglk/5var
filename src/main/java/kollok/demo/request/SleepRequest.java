package kollok.demo.request;

import javax.validation.constraints.Positive;

public class SleepRequest {

    @Positive(message = "Sleep duration must be a positive number")
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
