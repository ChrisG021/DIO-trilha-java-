public class MSNMensseger {
    //encapsulamento
    //nem tudo precisa ficar publico e nem tudo precisa ser manual pelo user
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico");
    }
}
