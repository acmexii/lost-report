package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ServiceRestored extends AbstractEvent {

    private Long id;
    private Long userId;
    private String imei;
    private String phoneNumber;
    private String rentalImei;
    private String forwardingNumber;
    private Date actionDate;
    private String status;

    public ServiceRestored(TeleService aggregate) {
        super(aggregate);
    }

    public ServiceRestored() {
        super();
    }
}
//>>> DDD / Domain Event
