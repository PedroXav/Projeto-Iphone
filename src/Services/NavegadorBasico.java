package src.Services;

import src.Base.NavegadorInternet;

public class NavegadorBasico implements NavegadorInternet{

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo:" + " " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando...");
    }
}
