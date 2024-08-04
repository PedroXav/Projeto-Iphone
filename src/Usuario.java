package src;

import src.Controller.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("------------------------------------------");

        System.out.println("Reprodutor de Música");

        iphone.selecionarMusica("Metronony - The Look");
        iphone.pausarMusica();

        System.out.println("------------------------------------------");

        System.out.println("Telefone");
        
        iphone.ligar("13483055656");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("------------------------------------------");

        System.out.println("Navegador Web");

        iphone.exibirPagina("https://github.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("------------------------------------------");
    }
    
}
