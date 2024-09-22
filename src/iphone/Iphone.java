package iphone;

import iphone.aparelho_telefonico.AparelhoTelefonico;
import iphone.navegador_internet.NavegadorInternet;
import iphone.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBIR NOVA PÁGINA:" + " " +  url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR PÁGINA");
    }

    @Override
    public void fecharAba() {
        System.out.println("FECHAR ABA");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER TELEFONE");
    }

    @Override
    public void desligar() {
        System.out.println("DESLIGAR LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIAR CORREIO DE VOZ");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("FAZER LIGAÇÃO:" + " " + numero);
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR MÚSICA");
    }

    @Override
    public void pular() {
        System.out.println("PULAR MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONAR MÚSICA:" + " " +  musica);
    }

    @Override
    public void tocar() {
        System.out.println("TOCAR MÚSICA");
    }
}
