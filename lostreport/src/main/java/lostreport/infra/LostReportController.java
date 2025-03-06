package lostreport.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import lostreport.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lostReports")
@Transactional
public class LostReportController {

    @Autowired
    LostReportRepository lostReportRepository;

    @RequestMapping(
        value = "/lostReports/{id}/applycall forwarding",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostReport applyCallForwarding(
        @PathVariable(value = "id") Long id,
        @RequestBody ApplyCallForwardingCommand applyCallForwardingCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /lostReport/applyCallForwarding  called #####"
        );
        Optional<LostReport> optionalLostReport = lostReportRepository.findById(
            id
        );

        optionalLostReport.orElseThrow(() -> new Exception("No Entity Found"));
        LostReport lostReport = optionalLostReport.get();
        lostReport.applyCallForwarding(applyCallForwardingCommand);

        lostReportRepository.save(lostReport);
        return lostReport;
    }

    @RequestMapping(
        value = "/lostReports/{id}/cancellost report",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostReport cancelLostReport(
        @PathVariable(value = "id") Long id,
        @RequestBody CancelLostReportCommand cancelLostReportCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /lostReport/cancelLostReport  called #####");
        Optional<LostReport> optionalLostReport = lostReportRepository.findById(
            id
        );

        optionalLostReport.orElseThrow(() -> new Exception("No Entity Found"));
        LostReport lostReport = optionalLostReport.get();
        lostReport.cancelLostReport(cancelLostReportCommand);

        lostReportRepository.save(lostReport);
        return lostReport;
    }
}
//>>> Clean Arch / Inbound Adaptor
