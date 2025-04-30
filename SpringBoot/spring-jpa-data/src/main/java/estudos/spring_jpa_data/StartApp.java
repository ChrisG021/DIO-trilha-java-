package estudos.spring_jpa_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import estudos.spring_jpa_data.model.User;
import estudos.spring_jpa_data.repository.UserRepository;
//n funcionando o query pra salvar

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("chris");
        user.setUsername("Lordchris");
        user.setPassword("1234");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
