package lostreport.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import lostreport.config.kafka.KafkaProcessor;
import lostreport.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DashboardViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private DashboardRepository dashboardRepository;
    //>>> DDD / CQRS
}
