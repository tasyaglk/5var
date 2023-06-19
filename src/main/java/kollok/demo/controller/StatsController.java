package kollok.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kollok.demo.request.StatsResponse;
import kollok.demo.service.StatsService;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService statsService;

    @Autowired
    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

//    @GetMapping
//    public ResponseEntity<StatsResponse> getStats() {
//        StatsResponse stats = statsService.getStats();
//        return ResponseEntity.ok(stats);
//    }

    @GetMapping
    public String getStats() {
        return "tvft";
    }


}
