package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class LostReportCacelled extends AbstractEvent {

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
}
