package tr.com.huseyinaydin.repositories;

import tr.com.huseyinaydin.documents.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {
}