package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.domain.보험청구거부됨;
import lostreport.domain.보험청구됨;
import lostreport.보험청구Application;

@Entity
@Table(name = "보험청구_table")
@Data
//<<< DDD / Aggregate Root
public class 보험청구 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long lostReportId;

    private Long userId;

    private String phoneNumber;

    private String reviewMsg;

    private Date claimDate;

    private String status;

    @PostPersist
    public void onPostPersist() {
        보험청구됨 보험청구됨 = new 보험청구됨(this);
        보험청구됨.publishAfterCommit();

        보험청구거부됨 보험청구거부됨 = new 보험청구거부됨(this);
        보험청구거부됨.publishAfterCommit();
    }

    public static 보험청구Repository repository() {
        보험청구Repository 보험청구Repository = 보험청구Application.applicationContext.getBean(
            보험청구Repository.class
        );
        return 보험청구Repository;
    }

    //<<< Clean Arch / Port Method
    public void 결과수신(결과수신Command 결과수신Command) {
        //implement business logic here:

        보험결과수신함 보험결과수신함 = new 보험결과수신함(this);
        보험결과수신함.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
