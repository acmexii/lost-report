package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ForwardingApplied extends AbstractEvent {

    private Long id;
    private Long userId;
    private String userName;
    private String phoneNumber;
    private String plazaId;
    private Long managerId;
    private Boolean callForwarded;
    private String forwardPhoneNumber;
    private Date lostDate;
    private String status;

    public ForwardingApplied(LostReport aggregate) {
        super(aggregate);
    }

    public ForwardingApplied() {
        super();
    }
}
//>>> DDD / Domain Event
