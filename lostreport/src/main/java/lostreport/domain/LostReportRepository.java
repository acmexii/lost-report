package lostreport.domain;

import java.util.Date;
import java.util.List;
import lostreport.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lostReports",
    path = "lostReports"
)
public interface LostReportRepository
    extends PagingAndSortingRepository<LostReport, Long> {
    @Query(
        value = "select lostReport " +
        "from LostReport lostReport " +
        "where(:userId is null or lostReport.userId like %:userId%) and (:phoneNumber is null or lostReport.phoneNumber like %:phoneNumber%)"
    )
    LostReport 분실폰조회(String userId, String phoneNumber);
}
