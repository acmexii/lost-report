package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.MemberApplication;
import lostreport.domain.UserRegistered;

@Entity
@Table(name = "Member_table")
@Data
//<<< DDD / Aggregate Root
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNumber;

    private Date openDate;

    private String email;

    private String status;

    @PostPersist
    public void onPostPersist() {
        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();
    }

    public static MemberRepository repository() {
        MemberRepository memberRepository = MemberApplication.applicationContext.getBean(
            MemberRepository.class
        );
        return memberRepository;
    }

    //<<< Clean Arch / Port Method
    public static void 분실접수및처리결과(
        ServiceInterrupted serviceInterrupted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Member member = new Member();
        repository().save(member);

        */

        /** Example 2:  finding and process
        
        // if serviceInterrupted.allehKtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> teleServiceMap = mapper.convertValue(serviceInterrupted.getAllehKtId(), Map.class);

        repository().findById(serviceInterrupted.get???()).ifPresent(member->{
            
            member // do something
            repository().save(member);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 분실접수및처리결과(보험결과수신함 보험결과수신함) {
        //implement business logic here:

        /** Example 1:  new item 
        Member member = new Member();
        repository().save(member);

        */

        /** Example 2:  finding and process
        
        // if 보험결과수신함.보험심사시스템Id exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> 보험청구Map = mapper.convertValue(보험결과수신함.get보험심사시스템Id(), Map.class);

        repository().findById(보험결과수신함.get???()).ifPresent(member->{
            
            member // do something
            repository().save(member);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
