import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;
        while (true) {
            GeometricForm geometricform = null;
            System.out.println("Escolha a forma geometrica");
            System.out.println("1 - quadrado");
            System.out.println("2 - retangulo");
            System.out.println("3 - circulo");
            System.out.println("4 - sair");
            op = scanner.nextInt();

            if (op == 1 ){
                geometricform = createSquare();
            }else if(op == 2 ){
                geometricform = createRectangle();
            }else if(op == 3 ){
                geometricform = createCircle();
            }else if (op == 4) {
                break;
            }
            else{
                System.out.println("opcao invalida");
                
            }
            System.out.println("A area da forma geométrica é "+ geometricform.getArea() );
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Ifnorme o tamanho dos lados:");
        var side  = scanner.nextDouble();
        return new Square(side);
    }
    private static GeometricForm createRectangle(){
        System.out.println("Ifnorme o tamanho da base:");
        var base  = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(base,height);
    }
    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do circulo: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}