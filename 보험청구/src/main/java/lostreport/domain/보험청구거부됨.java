package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 보험청구거부됨 extends AbstractEvent {

    private Long id;

    public 보험청구거부됨(보험청구 aggregate) {
        super(aggregate);
    }

    public 보험청구거부됨() {
        super();
    }
}
//>>> DDD / Domain Event
