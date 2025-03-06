package lostreport.domain;

import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "보험청구", path = "보험청구")
public interface 보험청구Repository
    extends PagingAndSortingRepository<보험청구, Long> {}
