package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ApplyCallForwardingCommand {

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
