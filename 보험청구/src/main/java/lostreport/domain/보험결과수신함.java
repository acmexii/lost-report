package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 보험결과수신함 extends AbstractEvent {

    private Long id;
    private Long lostReportId;
    private Long userId;
    private String phoneNumber;
    private String reviewMsg;
    private Date claimDate;
    private String status;

    public 보험결과수신함(보험청구 aggregate) {
        super(aggregate);
    }

    public 보험결과수신함() {
        super();
    }
}
//>>> DDD / Domain Event
