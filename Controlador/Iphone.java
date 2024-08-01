package Controlador;

import servico.NavegadorBasico;
import servico.ReprodutorMusicalBasico;
import servico.Telefone;


public class Iphone implements NavegadorBasico, ReprodutorMusicalBasico, Telefone {
    public static void main(String[] args){
        NavegadorBasico iphone = new NavegadorBasico();
        ReprodutorMusicalBasico rmb = iphone;
        telefone tel = iphone;


        iphone.exibirPagina();
        iphone.atualizar();
        iphone.ExibirNovaPagina();

        iphone.selecionarMusica();
        iphone.pausarMusica();

        iphone.ligarNumero();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        


    }
    




       
}
