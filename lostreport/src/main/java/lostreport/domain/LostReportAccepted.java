package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LostReportAccepted extends AbstractEvent {

    private Long id;
    private Long userId;
    private String userName;
    private String phoneNumber;
    private Date lostDate;
    private String status;

    public LostReportAccepted(LostReport aggregate) {
        super(aggregate);
    }

    public LostReportAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
