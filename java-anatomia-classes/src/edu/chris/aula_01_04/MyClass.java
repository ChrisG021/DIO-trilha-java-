package edu.chris.aula_01_04;
// aula01
// //se for uma classe executavel deve haver o metodo main
// public class MyClass {
//     public static void main(String [] args){ //
//         //o java é bem POO com mts classes
//         System.out.println("Hello World");
//     }
// }


// aula 02
//lembrar das conveções camelCase dessa forma ex:
//Padrao UPPERCASE COM variáveis não mutáveis 
// public class MyClass{
//     final String BR = "Brasil";//padrao de variaveis globais não alteráveis
//     final double PI = 3.14;

//     //metodo main
//     public static void main(String [] args){

//     }
// }

// aula 03
//declaração de variáveis

public class MyClass{

    //metodo main
    public static void main(String [] args){
        String fName = "Carlos";
        String sName = "Magno";
        
        String nomeCompleto = nomeCompleto(fName, sName);

        System.out.println(nomeCompleto);
    }

    //metodo nome completo
    public static String nomeCompleto(String fName, String sName) {
        return fName.concat(" ").concat(sName);
    }
}



