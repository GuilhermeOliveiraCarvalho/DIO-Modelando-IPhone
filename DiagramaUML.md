```mermaid
classDiagram
    class iPhone {
        -modelo: String
        -versaoSO: String
        -capacidadeBateria: int
        ligar()
        desligar()
        carregarBateria()
    }
    
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

    class ReprodutorMusical {
        tocarMusica()
        pausarMusica()
        selecionarMusica()
    }

    class AparelhoTelefonico {
        fazerLigacao()
        receberLigacao()
        acessarCorreioVoz()
    }

    class NavegadorInternet {
        abrirPaginaWeb()
        atualizarPagina()
        adicionarFavorito()
    }

    iPhone --> Camera
    iPhone --> VideoRecorder

    class Camera {
        tirarFoto()
    }

    class VideoRecorder {
        gravarVideo()
    }
