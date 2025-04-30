package estudos.spring_scopes_singleton_prototype.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")//com isso ele vai criar dois ojetos um no reply e um tech
    public Remetente remetente(){
        System.out.println("=== Criando um objeto remetente ===");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Marcos Nobrega");

        return remetente;
    }
}
