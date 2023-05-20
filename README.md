# Sistema de Gerenciamento de Biblioteca

📚 Um aplicativo em Java para gerenciar um acervo de livros, incluindo o rastreamento de empréstimos, devoluções e reservas.

## Descrição

O Sistema de Gerenciamento de Biblioteca é uma aplicação Java que permite aos usuários organizar e gerenciar um acervo de livros. O aplicativo é projetado para ser utilizado por meio da linha de comando, sem a necessidade de uma interface gráfica. Ele oferece recursos para adicionar, visualizar, pesquisar, emprestar, devolver e reservar livros. Os dados são armazenados em um banco de dados SQLite3, utilizando SQL  para interações.

## Requisitos

- Java Development Kit (JDK) 8 ou superior
- IDE Eclipse (ou qualquer outra IDE de sua escolha)
- Banco de dados SQLite3

## Passo a Passo para Construção

1. **Configuração do Ambiente:**

   - Instale o JDK em sua máquina e configure corretamente as variáveis de ambiente.
   - Baixe e instale o Eclipse (ou sua IDE preferida) para desenvolver o projeto.
   - Crie um novo projeto Java no Eclipse.

2. **Configuração do Banco de Dados:**

   - Baixe e instale o banco de dados SQLite3 a partir do site oficial: [https://www.sqlite.org/download.html](https://www.sqlite.org/download.html).
   - Crie um novo banco de dados SQLite3 para armazenar os dados do sistema.

3. **Estrutura do Projeto:**

   - No Eclipse, crie uma estrutura de pacotes para organizar as classes do projeto. Por exemplo:
   
     ```
     com.example.biblioteca
     ├── model
     │   ├── Book.java
     │   └── Library.java
     ├── repository
     │   └── LibraryRepository.java
     └── Main.java
     ```
     
   - Crie as classes `Book`, `Library`, `LibraryRepository` e `Main` dentro dos respectivos pacotes.

4. **Implementação do Banco de Dados:**

   - Utilize a biblioteca JDBC para se conectar ao banco de dados SQLite3. Certifique-se de ter o arquivo JAR do driver JDBC incluído em seu projeto.
   - Na classe `LibraryRepository`, implemente os métodos para executar as operações de CRUD no banco de dados, como adicionar, buscar, atualizar e excluir livros.

5. **Implementação do Modelo:**

   - Na classe `Book`, defina os atributos necessários para representar um livro, como `id`, `title`, `author` e `available`.
   - Na classe `Library`, implemente métodos para realizar as funcionalidades do sistema, como adicionar, visualizar, pesquisar, emprestar, devolver e reservar livros. Utilize os métodos do `LibraryRepository` para interagir com o banco de dados.

6. **Implementação do Ponto de Entrada:**

   - Na classe `Main`, crie um loop que exiba um menu para o usuário escolher as opções disponíveis. Capture as entradas do usuário e invoque os métodos apropriados da classe `Library` para executar as operações desejadas.

7. **Testes e Execução:**

   - Implemente testes unitários para verificar se as funcionalidades do sistema estão funcionando corretamente.
   - Execute o aplicativo no Eclipse e

 teste-o interagindo com a linha de comando.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novos recursos.

## Conexão com o Banco de Dados SQLite3

Para conectar-se a uma instância do banco de dados SQLite3 em Java , você pode usar a biblioteca JDBC (Java Database Connectivity). Siga os passos abaixo para configurar a conexão:

1. Certifique-se de ter o driver JDBC do SQLite em seu projeto. Você pode baixar o arquivo JAR mais recente do seguinte repositório:

   [https://github.com/xerial/sqlite-jdbc](https://github.com/xerial/sqlite-jdbc)

2. No Eclipse, clique com o botão direito do mouse no projeto e vá para **Properties** (Propriedades) > **Java Build Path** (Caminho de Compilação Java).

3. Na guia **Libraries** (Bibliotecas), clique em **Add External JARs** (Adicionar JARs Externos) e selecione o arquivo JAR do driver JDBC que você baixou.

4. Clique em **Apply and Close** (Aplicar e Fechar) para salvar as alterações.

5. Agora, você pode importar as classes necessárias para estabelecer a conexão com o banco de dados SQLite em seu código Java.

Com essas configurações, você estará pronto para interagir com o banco de dados SQLite3 em seu projeto Java  no Eclipse.

Utilize a IDE a seu favor, aproveitando recursos como o autocompletar, depuração passo a passo, refatoração de código e controle de versão integrado para tornar o desenvolvimento mais eficiente e produtivo.

Espero que essas instruções sejam úteis para a construção do seu projeto! Se tiver mais dúvidas, sinta-se à vontade para perguntar.