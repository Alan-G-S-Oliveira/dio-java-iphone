public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private String musica;
    private String numero;

    public Iphone(String numero) {
        this.numero = numero;
        this.musica = null; 
    }

    public String getMusica() {

        return this.musica;
    }

    public String getNumero() {

        return this.numero;
    }

    @Override
    public void exibirPagina() {
        
        System.out.println("Exibindo página...");
    }

    @Override
    public void adcionarNovaAba() {
        
        System.out.println("Adcionando nova página...");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Atualizando a página...");
    }

    @Override
    public void ligar(String numero) {
        
        System.out.println("Ligando para o número " + this.numero + "...");
    }

    @Override
    public void atender() {
        
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        
        System.out.println("Tocando a música " + this.musica + "...");
    }

    @Override
    public void pausar() {
        
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        
        this.musica = musica;
        System.out.println("Selecionada a música " + musica + " para a reprodução...");
    }
    


}
