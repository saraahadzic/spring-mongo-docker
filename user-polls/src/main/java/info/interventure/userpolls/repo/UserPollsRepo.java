package info.interventure.userpolls.repo;

import info.interventure.userpolls.model.UserPolls;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPollsRepo extends MongoRepository<UserPolls,String> {





}
