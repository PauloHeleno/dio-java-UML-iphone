public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public Iphone() {
        
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        AparelhoTelefonico.super.atender();
    }

    @Override
    public void iniciarCorreioDeVoz() {
        // TODO Auto-generated method stub
        AparelhoTelefonico.super.iniciarCorreioDeVoz();
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        AparelhoTelefonico.super.ligar(numero);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        NavegadorInternet.super.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        NavegadorInternet.super.atualizarPagina();
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        NavegadorInternet.super.exibirPagina(url);
    }

    @Override
    public void SelecionarMusica(String musica) {
        // TODO Auto-generated method stub
        ReprodutorMusical.super.SelecionarMusica(musica);
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        ReprodutorMusical.super.pausar();
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        ReprodutorMusical.super.tocar();
    } 

}
