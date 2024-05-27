public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.SelecionarMusica("Only you");
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina("http:");
        iphone.iniciarCorreioDeVoz();
        iphone.ligar("(xx) xxxxx xxxx");
        iphone.pausar();
        iphone.tocar();
    }
}
