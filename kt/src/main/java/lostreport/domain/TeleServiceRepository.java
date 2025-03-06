package lostreport.domain;

import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "teleServices",
    path = "teleServices"
)
public interface TeleServiceRepository
    extends PagingAndSortingRepository<TeleService, Long> {}
