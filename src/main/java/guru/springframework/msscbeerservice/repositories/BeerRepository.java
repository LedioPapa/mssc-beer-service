package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by ledio on 5/9/20
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
