package MongoDB.Spring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdentityRepository extends MongoRepository<Identity, Long> {

	public List<Identity> findByName(String name);
	
}
