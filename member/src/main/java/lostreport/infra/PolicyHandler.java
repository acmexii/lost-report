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
    MemberRepository memberRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServiceInterrupted'"
    )
    public void wheneverServiceInterrupted_분실접수및처리결과(
        @Payload ServiceInterrupted serviceInterrupted
    ) {
        ServiceInterrupted event = serviceInterrupted;
        System.out.println(
            "\n\n##### listener 분실접수및처리결과 : " +
            serviceInterrupted +
            "\n\n"
        );

        // Sample Logic //
        Member.분실접수및처리결과(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='보험결과수신함'"
    )
    public void whenever보험결과수신함_분실접수및처리결과(
        @Payload 보험결과수신함 보험결과수신함
    ) {
        보험결과수신함 event = 보험결과수신함;
        System.out.println(
            "\n\n##### listener 분실접수및처리결과 : " + 보험결과수신함 + "\n\n"
        );

        // Sample Logic //
        Member.분실접수및처리결과(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
