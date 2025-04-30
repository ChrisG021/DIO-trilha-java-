package api.spring_api_swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.spring_api_swagger.model.User;
import api.spring_api_swagger.repository.UserRepository;

@RestController
@RequestMapping("/users")//centraliaza a url
public class UserController {
    @Autowired
    private UserRepository repository;
    //repository é quem realmente tem a regra de negocio

    //esse
    @GetMapping
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")// users/ isso ai funciona como eu tava pensando
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping("/createuser")
    public void postUser(@RequestBody User user){
        repository.save(user);
    }
}
