package aula.com.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "", method = RequestMethod.GET) // Diz onde o método abaixo será acessado.
//    public List<User> getUser(){
    public List<User> findAll(){
//        User user = new User();
//        user.setName("Thiago");
//        user.setEmail("thiago@email.com");
//        return user;
        return userRepository.findAll();
    }

}
