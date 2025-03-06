package lostreport.domain;

import java.util.Date;
import lombok.Data;

@Data
public class 분실폰조회Query {

    private String userId;
    private String phoneNumber;
}
