package estudos.spring_properties_value.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMennsagem implements CommandLineRunner {
    // maneira expositiva
    // private String nome="Chris";
    // private String email ="chris@tech.com";
    // private List<Long> telefones =
    //  new ArrayList<>(Arrays.asList(new Long[]{1199998766l}));

    //maneira nova
    //com valores declarados no resources/application.properties
    //caso ele n encontre o valor name ele vai usar o padrao ":..."
    // @Value("${name:NoReply-Chris}")
    // private String nome;
    // @Value("${email}")
    // private String email;    
    // @Value("${telefones}")
    // private List<Long> telefones=
    //   new ArrayList<>(Arrays.asList(new Long[]{1199998766l}));
    @Autowired
    private Remetente remetente;


     @Override
     public void run(String... args) throws Exception {
         System.out.printf("mensagem enviada por %S\n email: %s\n telefones: %s\n", remetente.getNome(), remetente.getEmail(), remetente.getTelefones());
         System.out.println("Cadastro aprovado");
     }
     

    @Override
    public String toString() {
        return "SistemaMennsagem [nome=" + remetente.getNome() + ", email=" + remetente.getEmail() + ", telefones=" + remetente.getTelefones() + "]";
    }   
}
