package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class 보험청구됨 extends AbstractEvent {

    private Long id;
    private Long lostReportId;
    private Long userId;
    private String phoneNumber;
    private String reviewMsg;
    private Date claimDate;
    private String status;
}
