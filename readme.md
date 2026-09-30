# Little Database / Banco de Dados simples

[PT-BR](#português) | [English](#english)

## Português

### 🌐 Sobre o Projeto

O **Little Database** é um projeto em Java voltado para a resolução de desafios, exercícios e consultas relacionadas a banco de dados. O projeto estrutura soluções para questões/tarefas específicas (`pergunta1`, `pergunta2`, `pergunta3`) e inclui classes para execução e testes de código.

### 📁 Estrutura do Projeto

O projeto está organizado na seguinte estrutura:

```
litlledatabase-main/
├── src/
│   ├── Tasks/
│   │   └── database/
│   │       ├── pergunta1.java  # Resolução/Lógica do Desafio 1
│   │       ├── pergunta2.java  # Resolução/Lógica do Desafio 2
│   │       └── pergunta3.java  # Resolução/Lógica do Desafio 3
│   ├── Main.java               # Ponto de entrada principal da aplicação
│   └── Testcode.java           # Classe destinada a testes e rascunhos de código
├── .gitignore
└── teste.iml

```

### 🚀 Funcionalidades

* **Resolução de Desafios/Tarefas:** Módulos separados para resolver questões específicas sobre manipulação ou consulta de dados.
* **Ambiente de Testes:** Classe `Testcode.java` para validação rápida de trechos de código.
* **Execução Centralizada:** Classe `Main.java` configurada para orquestrar e rodar as tarefas.

### 🛠️ Pré-requisitos

* **Java JDK** 11 ou superior.
* **IDE Java** (IntelliJ IDEA, Eclipse, VS Code) ou Terminal.

### 🔧 Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/littledatabase.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd litlledatabase-main
   ```

3. Compile os arquivos Java:

   ```bash
   javac -d bin src/Main.java src/Testcode.java src/Tasks/database/*.java
   ```

4. Execute o programa principal:

   ```bash
   java -cp bin Main
   ```

---

## English

### 🌐 About The Project

**Little Database** is a Java-based project designed to solve database-related tasks, challenges, and queries. The repository structures solutions for specific questions (`pergunta1`, `pergunta2`, `pergunta3`) and includes classes for main execution and code testing.

### 📁 Project Structure

The project follows this directory layout:

```
litlledatabase-main/
├── src/
│   ├── Tasks/
│   │   └── database/
│   │       ├── pergunta1.java  # Solution/Logic for Challenge 1
│   │       ├── pergunta2.java  # Solution/Logic for Challenge 2
│   │       └── pergunta3.java  # Solution/Logic for Challenge 3
│   ├── Main.java               # Main entry point of the application
│   └── Testcode.java           # Sandbox class for testing code snippets
├── .gitignore
└── teste.iml

```

### 🚀 Features

* **Task & Question Resolution:** Modular classes solving specific database handling logic.
* **Testing Sandbox:** Dedicated `Testcode.java` file for experimenting and quick verification.
* **Centralized Entry Point:** Executable `Main.java` class to trigger task execution.

### 🛠️ Prerequisites

* **Java JDK** 11 or higher.
* Any **Java IDE** (IntelliJ IDEA, Eclipse, VS Code) or Terminal.

### 🔧 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/littledatabase.git
   ```

2. Navigate to the project directory:

   ```bash
   cd litlledatabase-main
   ```

3. Compile all Java files:

   ```bash
   javac -d bin src/Main.java src/Testcode.java src/Tasks/database/*.java
   ```

4. Run the main application:

   ```bash
   java -cp bin Main
   ```
