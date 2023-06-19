package kollok.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kollok.demo.request.NutritionRequest;
import kollok.demo.service.NutritionService;

@RestController
@RequestMapping("/nutrition")
public class NutritionController {

    private final NutritionService nutritionService;

    @Autowired
    public NutritionController(NutritionService nutritionService) {
        this.nutritionService = nutritionService;
    }

    @PostMapping
    public ResponseEntity<String> addNutrition(@Validated @RequestBody NutritionRequest request) {
        nutritionService.addNutrition(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("Nutrition data added successfully");
    }
}
