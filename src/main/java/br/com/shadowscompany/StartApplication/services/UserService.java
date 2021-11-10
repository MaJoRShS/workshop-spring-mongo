package br.com.shadowscompany.StartApplication.services;

import br.com.shadowscompany.StartApplication.domain.User;
import br.com.shadowscompany.StartApplication.dto.UserDTO;
import br.com.shadowscompany.StartApplication.repository.UserRepository;
import br.com.shadowscompany.StartApplication.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
