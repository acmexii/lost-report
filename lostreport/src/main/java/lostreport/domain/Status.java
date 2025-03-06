package lostreport.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

public enum Status {
    LOST,
    CALL_FORWARDED,
    INSURANCE_CLAIMED,
    UNBLOCKED,
    CASE_CLOSED,
}
