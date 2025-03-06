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
// @RequestMapping(value="/보험청구")
@Transactional
public class 보험청구Controller {

    @Autowired
    보험청구Repository 보험청구Repository;

    @RequestMapping(
        value = "/보험청구/{id}/결과수신",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 보험청구 결과수신(
        @PathVariable(value = "id") Long id,
        @RequestBody 결과수신Command 결과수신Command,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /보험청구/결과수신  called #####");
        Optional<보험청구> optional보험청구 = 보험청구Repository.findById(id);

        optional보험청구.orElseThrow(() -> new Exception("No Entity Found"));
        보험청구 보험청구 = optional보험청구.get();
        보험청구.결과수신(결과수신Command);

        보험청구Repository.save(보험청구);
        return 보험청구;
    }
}
//>>> Clean Arch / Inbound Adaptor
