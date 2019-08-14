package rt_labs.rest_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rt_labs.rest_api.domain.entities.Application;
import rt_labs.rest_api.domain.enums.ApplicationType;

import java.util.List;

@Repository
public interface ApplicationRepository extends MongoRepository<Application,String> {
  List<Application> findByType(ApplicationType type);
}
