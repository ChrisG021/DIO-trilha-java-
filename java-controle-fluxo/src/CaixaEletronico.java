public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 2560;
        double valorSolicitado = 3000;
        boolean res = valorSolicitado <= saldo ? true: false;
        if (res) {
            saldo = saldo - valorSolicitado;
        
        }else{
            System.out.println("Valor excedente ao saldo");
        }
    }
}
