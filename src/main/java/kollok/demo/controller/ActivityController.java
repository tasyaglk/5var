package kollok.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kollok.demo.request.ActivityRequest;
import kollok.demo.service.ActivityService;

@RestController
@RequestMapping(path = "/activity")
public class ActivityController {

    @PostMapping
    public ActivityRequest create(@RequestBody ActivityRequest request) {
        request.setActivityType("emae");
        request.setDurationInMinutes(20);
        request.setCaloriesBurned(100);
        return request;
    }

//    private final ActivityService activityService;
//
//    @Autowired
//    public ActivityController(ActivityService activityService) {
//        this.activityService = activityService;
//    }
//
//    @PostMapping
//    public ResponseEntity<String> addActivity(@Validated @RequestBody ActivityRequest request) {
//        activityService.addActivity(request);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Activity added successfully");
//    }
}
