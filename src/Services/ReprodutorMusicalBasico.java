package src.Services;

import src.Base.ReprodutorMusical;

public class ReprodutorMusicalBasico implements ReprodutorMusical{

    @Override
    public void tocarMusica(){
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada:" + " " + musica);
        tocarMusica();
    }
}