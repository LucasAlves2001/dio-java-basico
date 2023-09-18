package edu.lucas.segundasemana;
public class Minha_Classe {
    public static void main(String[] args) {
        
        String primeiroNome = "Lucas";
        String segundoNome = "Antonio";
        String terceiroNome = "Santos";
        String quartoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome, quartoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome, String quartoNome){
        return"Nome: " +  primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome).concat(" ").concat(quartoNome);
    }
}
