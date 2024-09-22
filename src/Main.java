public class Main {
    public static void main(String[] args) {


        iPhone meuIphone = new iPhone("iPhone 14", "iOS 16", 100);


        meuIphone.ligar();
        meuIphone.tocarMusica();
        meuIphone.fazerLigacao("123-456-7890");
        meuIphone.abrirPaginaWeb("https://www.apple.com");
        meuIphone.usarCamera();
        meuIphone.usarVideoRecorder();
        meuIphone.desligar();
    }
}

