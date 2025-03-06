package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.KtApplication;
import lostreport.domain.ForwardingServiceApplied;
import lostreport.domain.ServiceInterrupted;
import lostreport.domain.ServiceRestored;

@Entity
@Table(name = "TeleService_table")
@Data
//<<< DDD / Aggregate Root
public class TeleService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String imei;

    private String phoneNumber;

    private String rentalImei;

    private String forwardingNumber;

    private Date actionDate;

    private String status;

    public static TeleServiceRepository repository() {
        TeleServiceRepository teleServiceRepository = KtApplication.applicationContext.getBean(
            TeleServiceRepository.class
        );
        return teleServiceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void serviceInterrupt(LostReportAccepted lostReportAccepted) {
        //implement business logic here:

        /** Example 1:  new item 
        TeleService teleService = new TeleService();
        repository().save(teleService);

        ServiceInterrupted serviceInterrupted = new ServiceInterrupted(teleService);
        serviceInterrupted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportAccepted.get???()).ifPresent(teleService->{
            
            teleService // do something
            repository().save(teleService);

            ServiceInterrupted serviceInterrupted = new ServiceInterrupted(teleService);
            serviceInterrupted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void serviceRestore(LostReportCacelled lostReportCacelled) {
        //implement business logic here:

        /** Example 1:  new item 
        TeleService teleService = new TeleService();
        repository().save(teleService);

        ServiceRestored serviceRestored = new ServiceRestored(teleService);
        serviceRestored.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportCacelled.get???()).ifPresent(teleService->{
            
            teleService // do something
            repository().save(teleService);

            ServiceRestored serviceRestored = new ServiceRestored(teleService);
            serviceRestored.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
