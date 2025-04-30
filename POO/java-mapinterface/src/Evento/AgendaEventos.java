package Evento;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){ this.eventosMap = new HashMap<>();}

    public void adicionarEventos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        //organizado em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    
    public void obterProximoEvento(){
        // Set<LocalDate> dateSet = eventosMap.keySet();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate date = LocalDate.now();
        for (var entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(date) || entry.getKey().isAfter(date)) {
                System.out.println("O proximo evento: "+ entry.getValue()+" acontecera na data: "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}
