GTD Master - Edição Neumórfica
Uma aplicação web de lista de tarefas (To-Do List) desenvolvida com Java e Spring Boot, apresentando uma interface de usuário exclusiva com design Neumórfico.

Este projeto foi criado como um exercício prático para aplicar conceitos de desenvolvimento backend com Spring Boot e frontend com Thymeleaf, focando em uma experiência de usuário limpa e esteticamente agradável.

🎨 Visual do Projeto
A interface utiliza o Neumorfismo, um estilo de design que usa sombras e luzes suaves para criar uma aparência tátil e moderna, fazendo com que os elementos pareçam flutuar na tela.

<img width="1197" height="773" alt="image" src="https://github.com/user-attachments/assets/075c6639-665e-4852-8452-02285595a42a" />
---------------------
<img width="749" height="649" alt="image" src="https://github.com/user-attachments/assets/218f930f-630b-4963-8745-84bcdc8cede1" />
Atualizacao 1.1

<img width="943" height="639" alt="2" src="https://github.com/user-attachments/assets/f76c0b30-1a14-4892-abdd-6f597ff1a47f" />
Atualizacao 1.1

<img width="863" height="581" alt="image" src="https://github.com/user-attachments/assets/40e8e486-e588-41a8-99eb-c84d5af64528" />
atualizacao 1.1

<img width="867" height="617" alt="image" src="https://github.com/user-attachments/assets/46112ce9-6ccc-4a73-ade0-4c53aba0f8b8" />
atualizacao 1.1

<img width="845" height="586" alt="image" src="https://github.com/user-attachments/assets/e3463e8c-bb95-4d58-a8f4-9fc7f5e6158f" />

🎉 Release v1.1.0 - A Atualização de Experiência e Arquitetura
Esta é uma grande atualização para o GTD Master, focada em transformar a aplicação em uma experiência de usuário moderna, intuitiva e robusta. Deixamos para trás a interface básica e reconstruímos a interação, além de refatorarmos o backend para seguir as melhores práticas.

✨ O Que Há de Novo?
🎨 Nova Interface com Design Neumórfico

🚀 Edição de Tarefas Dinâmica e Intuitiva
A funcionalidade de edição foi totalmente repensada com foco em UX:

Clique para Editar: Para editar uma tarefa, basta clicar diretamente sobre o texto dela.

Salvamento Automático: As alterações são salvas ao pressionar Enter ou ao clicar fora do campo de texto.

Cancelamento Fácil: Pressione Escape (Esc) para cancelar a edição a qualquer momento.

onboarding de Usuário
Popup de Boas-Vindas: Na primeira visita, um popup informativo aparece para guiar o usuário sobre as novas dinâmicas de edição e conclusão de tarefas. Esta mensagem só é exibida uma vez.

---------------

✨ Funcionalidades
Adicionar Tarefas: Crie novas tarefas através de um campo de texto intuitivo.

Listar Tarefas e edite: Visualize todas as suas tarefas pendentes e concluídas e alem disso coma nova atualizacao 1.1
voce poderar editar tarefas existentes.

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

git clone https://github.com/GustavoRio99/Aplicacao-Web-ToDo..git
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




