package br.com.citcolab.citwebservices.services;
import br.com.citcolab.citwebservices.model.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDetails auth(UserEntity user);
}
