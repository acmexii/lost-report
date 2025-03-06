package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class 결과수신Command {

    private String claimId;
    private String reviewRslt;
}
