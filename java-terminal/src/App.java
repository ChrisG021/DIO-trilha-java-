import java.util.Locale;
import java.util.Scanner;

public class App {
    //lembrar que usar o terminal de maneira que fizemos via argumentos tb tem sua utilidade
    //LEMBRAR de configurar os args no settigns vscode/launch.json
    public static void main(String[] args) throws Exception {
        //classe que vai servir para pegar valores do terminal de maneira dinamica
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String name = scanner.next();

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura");
        double height = scanner.nextDouble();

        System.out.println("Nome: "+name);
        System.out.println("Idade: "+age);
        System.out.println("Altura: "+height);

    }
}
