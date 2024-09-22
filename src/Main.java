import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone_1212 = new Iphone();

        iphone_1212.ligar("2020-2020");
        iphone_1212.desligar();

        iphone_1212.adicionarNovaAba();
        iphone_1212.exibirPagina("www.google.com");

        iphone_1212.pular();
        iphone_1212.selecionarMusica("Because of You - Ne-yo");
    }
}