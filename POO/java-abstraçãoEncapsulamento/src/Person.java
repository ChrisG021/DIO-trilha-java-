public class Person {
    private String name;
    private String cpf;

    //===construct===
    public Person(){};// instanciar com e sem atributos diretos
    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
//=================getters=================
    public String getName(){
        return this.name;
    }
    public String getCpf(){
        return this.cpf;
    }

//=================setters=================

    public void setName(String name){
        this.name = name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
//=========================================
}
