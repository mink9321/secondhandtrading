package secondhandtrading.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import secondhandtrading.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "tradings", path = "tradings")
public interface TradingRepository
    extends PagingAndSortingRepository<Trading, Long> {}
