public class Operadores {
    
    
    public static void main(String[] args) throws Exception {
        int numero = 10;
        boolean var = false;
        String res = var ? "verdadeiro" : "falso";
        System.out.println(-- numero);//aqui ele vaio de 10 a 9 e imprime
        System.out.println(numero --);// 9 a 8 porem ele mostra antes de decrementar
        if(var == !true){
            System.out.println(res);
        } else{
            System.out.println(res);
        }
    }
}
