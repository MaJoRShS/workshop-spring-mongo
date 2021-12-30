package br.com.shadowscompany.StartApplication.services;

import br.com.shadowscompany.StartApplication.domain.Post;
import br.com.shadowscompany.StartApplication.domain.User;
import br.com.shadowscompany.StartApplication.repository.PostRepository;
import br.com.shadowscompany.StartApplication.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }



}
