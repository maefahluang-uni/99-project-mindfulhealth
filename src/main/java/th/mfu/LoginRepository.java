package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Concert;


public interface LoginRepository extends CrudRepository<Concert, Long> {
      
}