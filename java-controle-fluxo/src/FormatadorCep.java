public class FormatadorCep {
    public static void main(String[] args) {
        //por executar um excepetion la na frente ele vai exigir que aqui seja um try catch
        try {
            String cepFormatado= formatarCep("3300455");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Não corresponde a regra de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length()!=8){
            throw new CepInvalidoException();
        }

        //simulando um cep formatado
        return"23.765-064";
    }
}
