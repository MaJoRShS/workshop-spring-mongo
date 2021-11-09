package br.com.shadowscompany.StartApplication.repository;

import br.com.shadowscompany.StartApplication.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
