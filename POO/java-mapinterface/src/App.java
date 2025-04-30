import Contato.AgendaContatos;

public class App {
    // esse modelo do map me lembra muito dict do python, modelo key e value
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("chris", 1234);
        agendaContatos.adicionarContato("carlos", 234);
        agendaContatos.adicionarContato("mauro", 555);
        agendaContatos.adicionarContato("liliam", 666);

        agendaContatos.exibirContato();

    }
}
