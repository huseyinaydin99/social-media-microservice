package tr.com.huseyinaydin.repositories;

import tr.com.huseyinaydin.entities.Auth;

public interface AuthRepository extends MyGenericRepository<Auth, Long> {
    boolean existsByUserNameAndPassword(String userName, String password);
}