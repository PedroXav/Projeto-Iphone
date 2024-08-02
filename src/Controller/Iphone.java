package src.Controller;

import src.Base.AparelhoTelefonico;
import src.Base.NavegadorInternet;
import src.Base.ReprodutorMusical;
import src.Services.NavegadorBasico;
import src.Services.ReprodutorMusicalBasico;
import src.Services.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico   {
        private final ReprodutorMusical reprodutorMusicalBasico;
        private final AparelhoTelefonico telefone;
        private final NavegadorInternet navegadorBasico;

        public Iphone(){
            this.reprodutorMusicalBasico = new ReprodutorMusicalBasico();
            this.telefone = new Telefone();
            this.navegadorBasico = new NavegadorBasico();
                
        }

        @Override
        public void tocarMusica(){
            reprodutorMusicalBasico.tocarMusica();
        }

        @Override
        public void pausarMusica(){
            reprodutorMusicalBasico.pausarMusica();
        }
    
        @Override
        public void selecionarMusica(String musica){
           reprodutorMusicalBasico.selecionarMusica(musica);
        }

        @Override
        public void ligar(String numero){
            telefone.ligar(numero);
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
            navegadorBasico.exibirPagina(url);
        }

        @Override
        public void adicionarNovaAba(){
            navegadorBasico.adicionarNovaAba();
          }

        @Override
        public void atualizarPagina(){
            navegadorBasico.atualizarPagina();
        }
            


        
    




       
}
