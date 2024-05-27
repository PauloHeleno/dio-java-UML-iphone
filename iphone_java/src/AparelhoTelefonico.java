public interface AparelhoTelefonico {

    public default void ligar(String numero) {
        System.out.println("Ligando para o número" + numero);
    }
    public default void atender() {
    System.err.println("Atendendo!");
    }
    public default void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
