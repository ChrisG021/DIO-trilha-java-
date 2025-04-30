package api.spring_api_swagger.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import api.spring_api_swagger.model.User;
@Component
public class UserRepository  {
    public void save(User user){
        if (user.getId()==null) {
            System.out.println("SAVE - RECEBENDO USUARIO ");
        }else
            System.out.println("Update - RECEBENDO USUARIO");
    }
    public void deleteById(Integer id){
        System.out.println("DELETE/ID - deletando usuario com id: "+id);
    }
    public List<User> findAll(){
        System.out.println("LIST - listando usuarios");
        List<User> users  =new ArrayList<>();
        users.add(new User("gleyson","12234"));
        users.add(new User("marcos","2222"));

        return users;

    }
    public User findByUsername(String username) {
        System.out.println("FIND/ID");
        return new User("chris", "222");
    }

}
