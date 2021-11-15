package br.com.shadowscompany.StartApplication.repository;

import br.com.shadowscompany.StartApplication.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
