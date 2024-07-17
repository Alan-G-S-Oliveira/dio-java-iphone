public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone lixo = new Iphone("4002-8922");

        lixo.adcionarNovaAba();
        lixo.exibirPagina();
        lixo.atualizarPagina();

        lixo.atender();
        lixo.ligar("0707-4133");
        lixo.iniciarCorreioVoz();

        lixo.selecionarMusica("ievan polkka");
        lixo.tocar();
        lixo.pausar();
    }
}
