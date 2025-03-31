public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //da no mesmo as duas so que uma eu usei o 0 para mostrar que deu certo
    public int ligar(){
        ligada = true;
        return 0;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }


}
