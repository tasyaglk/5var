package kollok.demo.service;

import org.springframework.stereotype.Service;
import kollok.demo.request.StatsResponse;

@Service
public class StatsService {

    public StatsResponse getStats() {
        StatsResponse stats = new StatsResponse();
        return stats;
    }
}
