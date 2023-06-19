package kollok.demo.service;

import org.springframework.stereotype.Service;
import kollok.demo.request.NutritionRequest;

@Service
public class NutritionService {

    public void addNutrition(NutritionRequest request) {
        request.setDishName("Zapekanka");
        request.setPortionSize(2);
        request.setCaloriesConsumed(100);
    }
}
