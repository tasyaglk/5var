package kollok.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kollok.demo.request.SleepRequest;
import kollok.demo.service.SleepService;

@RestController
@RequestMapping("/sleep")
public class SleepController {

    private final SleepService sleepService;

    @Autowired
    public SleepController(SleepService sleepService) {
        this.sleepService = sleepService;
    }

    @PostMapping
    public ResponseEntity<String> addSleep(@Validated @RequestBody SleepRequest request) {
        sleepService.addSleep(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("Sleep data added successfully");
    }
}
