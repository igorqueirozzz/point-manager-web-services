package br.com.citcolab.citwebservices.services;

import br.com.citcolab.citwebservices.model.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    ResponseEntity createUser(UserEntity userEntity);

}
