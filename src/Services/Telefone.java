package src.Services;

import src.Base.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{
    
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para:" + " " + numero);
       
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz... PIII");
    }
    
}