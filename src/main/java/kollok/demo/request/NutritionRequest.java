package kollok.demo.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class NutritionRequest {

    @NotEmpty(message = "Dish name must not be empty")
    private String dishName;

    @Positive(message = "Portion size must be a positive number")
    private int portionSize;

    @Positive(message = "Calories consumed must be a positive number")
    private int caloriesConsumed;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }

    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public void setCaloriesConsumed(int caloriesConsumed) {
        this.caloriesConsumed = caloriesConsumed;
    }
}
