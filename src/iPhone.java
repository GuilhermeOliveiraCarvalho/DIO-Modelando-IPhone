public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versaoSO;
    private int capacidadeBateria;

    private Camera camera;
    private VideoRecorder videoRecorder;

    public iPhone(String modelo, String versaoSO, int capacidadeBateria) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
        this.capacidadeBateria = capacidadeBateria;
        this.camera = new Camera();
        this.videoRecorder = new VideoRecorder();
    }

    public void ligar() {
        System.out.println("O iPhone está ligando...");
    }

    public void desligar() {
        System.out.println("O iPhone está desligando...");
    }

    public void carregarBateria() {
        System.out.println("O iPhone está carregando a bateria.");
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    @Override
    public void receberLigacao() {
        System.out.println("Recebendo uma ligação...");
    }

    @Override
    public void acessarCorreioVoz() {
        System.out.println("Acessando o correio de voz...");
    }

    // Métodos de NavegadorInternet
    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo a página web: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página web...");
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando a página aos favoritos: " + url);
    }

    // Métodos para usar a câmera e o gravador de vídeo
    public void usarCamera() {
        camera.tirarFoto();
    }

    public void usarVideoRecorder() {
        videoRecorder.gravarVideo();
    }
}

