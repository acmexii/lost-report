package lostreport.domain;

import lostreport.domain.LostReportAccepted;
import lostreport.LostreportApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="LostReport_table")
@Data

//<<< DDD / Aggregate Root
public class LostReport  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long userId;
    
    
    
    
    private String userName;
    
    
    
    
    private String phoneNumber;
    
    
    
    
    private String plazaId;
    
    
    
    
    private Long managerId;
    
    
    
    
    private Boolean callForwarded;
    
    
    
    
    private String forwardPhoneNumber;
    
    
    
    
    private Date lostDate;
    
    
    
    @Enumerated(EnumType.STRING)
    private Status status;

    @PostPersist
    public void onPostPersist(){


        LostReportAccepted lostReportAccepted = new LostReportAccepted(this);
        lostReportAccepted.publishAfterCommit();

    
    }

    public static LostReportRepository repository(){
        LostReportRepository lostReportRepository = LostreportApplication.applicationContext.getBean(LostReportRepository.class);
        return lostReportRepository;
    }



//<<< Clean Arch / Port Method
    public void applyCallForwarding(ApplyCallForwardingCommand applyCallForwardingCommand){
        
        //implement business logic here:
        

        lostreport.external.LostReportQuery lostReportQuery = new lostreport.external.LostReportQuery();
        // lostReportQuery.set??()        
          = LostReportApplication.applicationContext
            .getBean(lostreport.external.Service.class)
            .lostReport(lostReportQuery);

        ForwardingApplied forwardingApplied = new ForwardingApplied(this);
        forwardingApplied.publishAfterCommit();
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void cancelLostReport(CancelLostReportCommand cancelLostReportCommand){
        
        //implement business logic here:
        


        LostReportCacelled lostReportCacelled = new LostReportCacelled(this);
        lostReportCacelled.publishAfterCommit();
    }
//>>> Clean Arch / Port Method

//<<< Clean Arch / Port Method
    public static void updateLostReportStatus(보험청구됨 보험청구됨){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        LostReport lostReport = new LostReport();
        repository().save(lostReport);

        */

        /** Example 2:  finding and process
        
        // if 보험청구됨.보험심사시스템Id exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> 보험청구Map = mapper.convertValue(보험청구됨.get보험심사시스템Id(), Map.class);

        repository().findById(보험청구됨.get???()).ifPresent(lostReport->{
            
            lostReport // do something
            repository().save(lostReport);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void updateLostReportStatus(보험결과수신함 보험결과수신함){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        LostReport lostReport = new LostReport();
        repository().save(lostReport);

        */

        /** Example 2:  finding and process
        
        // if 보험결과수신함.보험심사시스템Id exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> 보험청구Map = mapper.convertValue(보험결과수신함.get보험심사시스템Id(), Map.class);

        repository().findById(보험결과수신함.get???()).ifPresent(lostReport->{
            
            lostReport // do something
            repository().save(lostReport);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void updateLostReportStatus(ServiceInterrupted serviceInterrupted){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        LostReport lostReport = new LostReport();
        repository().save(lostReport);

        */

        /** Example 2:  finding and process
        
        // if serviceInterrupted.allehKtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> teleServiceMap = mapper.convertValue(serviceInterrupted.getAllehKtId(), Map.class);

        repository().findById(serviceInterrupted.get???()).ifPresent(lostReport->{
            
            lostReport // do something
            repository().save(lostReport);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void updateLostReportStatus(ForwardingServiceApplied forwardingServiceApplied){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        LostReport lostReport = new LostReport();
        repository().save(lostReport);

        */

        /** Example 2:  finding and process
        
        // if forwardingServiceApplied.allehKtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> teleServiceMap = mapper.convertValue(forwardingServiceApplied.getAllehKtId(), Map.class);

        repository().findById(forwardingServiceApplied.get???()).ifPresent(lostReport->{
            
            lostReport // do something
            repository().save(lostReport);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void updateLostReportStatus(ServiceRestored serviceRestored){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        LostReport lostReport = new LostReport();
        repository().save(lostReport);

        */

        /** Example 2:  finding and process
        
        // if serviceRestored.allehKtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> teleServiceMap = mapper.convertValue(serviceRestored.getAllehKtId(), Map.class);

        repository().findById(serviceRestored.get???()).ifPresent(lostReport->{
            
            lostReport // do something
            repository().save(lostReport);


         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
