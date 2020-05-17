package aula.com.projeto.controllers;

import aula.com.projeto.repository.UserRepository;
import aula.com.projeto.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "", method = RequestMethod.GET) // Diz onde o método abaixo será acessado.
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) // Diz onde o método abaixo será acessado.
    public void findAll(@PathVariable Long id){
        userRepository.deleteById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User save(@RequestBody User user){
       return userRepository.save(user);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User update(@RequestBody User user){
       return userRepository.save(user);
    }

}
