package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class LostReportAccepted extends AbstractEvent {

    private Long id;
    private Long userId;
    private String userName;
    private String phoneNumber;
    private Date lostDate;
    private String status;
}
