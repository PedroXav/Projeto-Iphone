package src.Controller;

import src.Base.AparelhoTelefonico;
import src.Base.NavegadorInternet;
import src.Base.ReprodutorMusical;
import src.Services.NavegadorBasico;
import src.Services.ReprodutorMusicalBasico;
import src.Services.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico   {
        private final ReprodutorMusical musica;
        private final AparelhoTelefonico telefone;
        private final NavegadorInternet navegadorWeb;

        public Iphone(){
            this.musica = new ReprodutorMusicalBasico();
            this.telefone = new Telefone();
            this.navegadorWeb = new NavegadorBasico();
                
        }

        @Override
        public void tocarMusica(){
            musica.tocarMusica();
        }

        @Override
        public void pausarMusica(){
           musica.pausarMusica();
        }
    
        @Override
        public void selecionarMusica(String musica){
           this.musica.selecionarMusica(musica);
        }

        @Override
        public void ligarNumero(String numero){
            telefone.ligarNumero(numero);
        }
    
        @Override
        public void atender(){
            telefone.atender();
        }
    
        @Override
        public void iniciarCorreioVoz(){
            telefone.iniciarCorreioVoz();
        }

        @Override
        public void exibirPagina(String url){
            navegadorWeb.exibirPagina(url);
        }

        @Override
        public void adicionarNovaAba(){
            navegadorWeb.adicionarNovaAba();
          }

        @Override
        public void atualizarPagina(){
            navegadorWeb.atualizarPagina();
        }
            


        
    




       
}
