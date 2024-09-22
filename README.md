# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Este projeto faz parte do **Bootcamp Claro - Java com Spring Boot** da [Digital Innovation One (DIO)](https://www.dio.me/). O desafio consiste em **modelar o iPhone utilizando UML** e, em seguida, implementar as classes e interfaces em Java, aplicando os quatro pilares da programação orientada a objetos (POO): **Herança**, **Polimorfismo**, **Abstração**, e **Encapsulamento**.

## Descrição do Desafio

Neste desafio, foi elaborado um diagrama UML utilizando **Mermaid** que modela as principais funcionalidades do iPhone, como **Reprodutor Musical**, **Aparelho Telefônico**, e **Navegador de Internet**. Além disso, funcionalidades adicionais como câmera e gravação de vídeo foram incluídas.

A implementação em Java segue o diagrama UML, criando uma abstração do iPhone e simulando o uso dessas funcionalidades. Foram aplicados os conceitos de POO, utilizando interfaces para definir comportamentos e encapsulando os detalhes dentro de classes concretas.

### Funcionalidades Abstraídas

- **Reprodutor Musical**: Tocar, pausar e selecionar músicas.
- **Aparelho Telefônico**: Fazer e receber chamadas, além de acessar o correio de voz.
- **Navegador de Internet**: Abrir e atualizar páginas web, e adicionar favoritos.
- **Câmera e Gravação de Vídeo**: Tirar fotos e gravar vídeos.
  
## Diagrama UML

O diagrama UML em formato Mermaid está disponível no arquivo, modelando as classes e interfaces que representam o iPhone e suas funcionalidades.

## Estrutura do Código

O código Java contém as seguintes classes e interfaces:

- **iPhone**: Classe principal que implementa as interfaces de funcionalidades.
- **ReprodutorMusical**, **AparelhoTelefonico**, **NavegadorInternet**: Interfaces que definem comportamentos específicos.
- **Camera** e **VideoRecorder**: Classes para funcionalidades adicionais de tirar fotos e gravar vídeos.

### Pilares de POO Aplicados

1. **Abstração**: Definição de interfaces que abstraem as funcionalidades principais do iPhone.
2. **Encapsulamento**: Detalhes internos (atributos e métodos) são encapsulados nas classes, proporcionando proteção aos dados.
3. **Herança**: Uso de interfaces que permitem a implementação de múltiplos comportamentos em uma única classe.
4. **Polimorfismo**: Implementação de várias interfaces na classe `iPhone`, permitindo a utilização de diferentes funcionalidades de forma polimórfica.

