GTD Master - Edição Neumórfica
Uma aplicação web de lista de tarefas (To-Do List) desenvolvida com Java e Spring Boot, apresentando uma interface de usuário exclusiva com design Neumórfico.

Este projeto foi criado como um exercício prático para aplicar conceitos de desenvolvimento backend com Spring Boot e frontend com Thymeleaf, focando em uma experiência de usuário limpa e esteticamente agradável.

🎨 Visual do Projeto
A interface utiliza o Neumorfismo, um estilo de design que usa sombras e luzes suaves para criar uma aparência tátil e moderna, fazendo com que os elementos pareçam flutuar na tela.

<img width="1197" height="773" alt="image" src="https://github.com/user-attachments/assets/075c6639-665e-4852-8452-02285595a42a" />


✨ Funcionalidades
Adicionar Tarefas: Crie novas tarefas através de um campo de texto intuitivo.

Listar Tarefas: Visualize todas as suas tarefas pendentes e concluídas.

Marcar como Concluída: Altere o status de uma tarefa com um único clique.

Remover Tarefas: Exclua tarefas que não são mais necessárias.

Design Responsivo: A interface se adapta perfeitamente a desktops e dispositivos móveis.

🛠️ Tecnologias Utilizadas
O projeto foi construído com as seguintes tecnologias:

Backend:

Java 17+

Spring Boot: Framework principal para a criação da aplicação web.

Maven: Gerenciador de dependências do projeto.

Frontend (Renderização no Servidor):

Thymeleaf: Motor de templates para gerar o HTML dinamicamente no backend.

HTML5

Tailwind CSS: Framework CSS para estilização rápida e responsiva.

🚀 Como Executar o Projeto Localmente
Para rodar este projeto na sua máquina, siga os passos abaixo.

Pré-requisitos:

JDK 17 ou superior instalado.

Apache Maven instalado.

Um editor de código ou IDE de sua preferência (IntelliJ, VS Code, Eclipse, etc.).

Passos:

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

Compile o projeto com o Maven:
(O Maven Wrapper incluído no projeto cuidará de tudo)

# No Windows
./mvnw clean install

# No Linux/Mac
./mvnw clean install

Execute a aplicação:

java -jar target/webtodo-0.0.1-SNAPSHOT.jar 

(O nome do arquivo .jar pode variar de acordo com as configurações do seu pom.xml)

Acesse no navegador:
Abra seu navegador e acesse a URL: http://localhost:8080

📂 Estrutura do Projeto
A arquitetura do código segue o princípio da Separação de Responsabilidades:

src/main/java/br/com/todolist/webtodo/
├── Tarefa.java               # O Modelo (define o que é uma tarefa)
├── TarefaController.java     # O Controller (recebe as requisições web)
└── WebtodoApplication.java   # Ponto de entrada da aplicação Spring Boot

src/main/resources/
└── templates/
    └── index.html            # A View (página HTML com Thymeleaf)

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.


