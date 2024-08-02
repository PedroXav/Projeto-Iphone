package src;

import src.Controller.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Metronony - The Look");
        iphone.pausarMusica();
        
        iphone.ligar("13483055656");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://github.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    
}
