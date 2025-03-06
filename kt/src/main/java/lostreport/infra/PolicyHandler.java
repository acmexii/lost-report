package lostreport.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import lostreport.config.kafka.KafkaProcessor;
import lostreport.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    TeleServiceRepository teleServiceRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportAccepted'"
    )
    public void wheneverLostReportAccepted_ServiceInterrupt(
        @Payload LostReportAccepted lostReportAccepted
    ) {
        LostReportAccepted event = lostReportAccepted;
        System.out.println(
            "\n\n##### listener ServiceInterrupt : " +
            lostReportAccepted +
            "\n\n"
        );

        // Sample Logic //
        TeleService.serviceInterrupt(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCacelled'"
    )
    public void wheneverLostReportCacelled_ServiceRestore(
        @Payload LostReportCacelled lostReportCacelled
    ) {
        LostReportCacelled event = lostReportCacelled;
        System.out.println(
            "\n\n##### listener ServiceRestore : " + lostReportCacelled + "\n\n"
        );

        // Sample Logic //
        TeleService.serviceRestore(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
