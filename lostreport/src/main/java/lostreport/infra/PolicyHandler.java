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
    LostReportRepository lostReportRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='보험청구됨'"
    )
    public void whenever보험청구됨_UpdateLostReportStatus(
        @Payload 보험청구됨 보험청구됨
    ) {
        보험청구됨 event = 보험청구됨;
        System.out.println(
            "\n\n##### listener UpdateLostReportStatus : " + 보험청구됨 + "\n\n"
        );

        // Sample Logic //
        LostReport.updateLostReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='보험결과수신함'"
    )
    public void whenever보험결과수신함_UpdateLostReportStatus(
        @Payload 보험결과수신함 보험결과수신함
    ) {
        보험결과수신함 event = 보험결과수신함;
        System.out.println(
            "\n\n##### listener UpdateLostReportStatus : " +
            보험결과수신함 +
            "\n\n"
        );

        // Sample Logic //
        LostReport.updateLostReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceInterrupted'"
    )
    public void wheneverServiceInterrupted_UpdateLostReportStatus(
        @Payload ServiceInterrupted serviceInterrupted
    ) {
        ServiceInterrupted event = serviceInterrupted;
        System.out.println(
            "\n\n##### listener UpdateLostReportStatus : " +
            serviceInterrupted +
            "\n\n"
        );

        // Sample Logic //
        LostReport.updateLostReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ForwardingServiceApplied'"
    )
    public void wheneverForwardingServiceApplied_UpdateLostReportStatus(
        @Payload ForwardingServiceApplied forwardingServiceApplied
    ) {
        ForwardingServiceApplied event = forwardingServiceApplied;
        System.out.println(
            "\n\n##### listener UpdateLostReportStatus : " +
            forwardingServiceApplied +
            "\n\n"
        );

        // Sample Logic //
        LostReport.updateLostReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceRestored'"
    )
    public void wheneverServiceRestored_UpdateLostReportStatus(
        @Payload ServiceRestored serviceRestored
    ) {
        ServiceRestored event = serviceRestored;
        System.out.println(
            "\n\n##### listener UpdateLostReportStatus : " +
            serviceRestored +
            "\n\n"
        );

        // Sample Logic //
        LostReport.updateLostReportStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
