public class Aluno {
    private String name;
    private int age;
    private int cpf;

    //metodo construct, ja instancia com valores iniciais

    public Aluno(String name, int age, int cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCpf() {
        return cpf;
    }
    
     
//     public void setName(String newname){
//         name = newname;
//     }

//     public String getName(){
//         return name;
//     }
}
