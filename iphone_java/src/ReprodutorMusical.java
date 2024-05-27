public interface ReprodutorMusical {

    public default  void tocar(){
        System.out.println("Tocando Musica");
    }
    public default void pausar() {
        System.out.println("Pausando");
    }
    public default void SelecionarMusica(String musica) {
        System.out.println("Trocando para a música: " + musica);
    }

}
