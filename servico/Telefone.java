package servico;


import Projeto.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{
    
    public void ligarNumero(String numero){
        System.out.println("Ligando..." + " " + numero);
       
    }

    public void atender(){
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz... PIII");
    }
    
}