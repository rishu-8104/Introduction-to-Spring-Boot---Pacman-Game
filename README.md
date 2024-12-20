# Introduction to Spring Boot - Pacman Game

This project demonstrates a simple Spring Boot application by building a Pacman game. It serves as an introduction to Spring Boot's features and setup, showcasing the structure of a basic Spring Boot application and integrating game-related classes.

## Introduction

This application simulates a simple Pacman game. The core game logic is implemented using several classes, including `Pacman`, `SuperMario`, `GameConsole`, and `GameRunner`. The game is structured as a Spring Boot application, demonstrating how to set up and run a basic Spring Boot app with simple business logic.

### Key Features:
- **Pacman Game Logic**: Implements the basic Pacman game behavior.
- **SuperMario**: A placeholder class that represents a different game character for potential future expansion.
- **Spring Boot Application**: A simple Spring Boot setup to manage the game logic and run the application.
- **Test Integration**: The project includes basic unit tests to verify the correct behavior of the game components.

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Features](#features)
4. [Contributing](#contributing)
5. [License](#license)
6. [Contact Information](#contact-information)
7. [Acknowledgements](#acknowledgements)

## Installation

To set up and run the Pacman game, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/rishu-8104/Introduction-to-Spring-Boot---Pacman-Game.git
    cd introduction-to-spring-boot-main
    ```

2. **Install dependencies**:
   This project uses Maven to manage dependencies.

   - If Maven is not installed, download and install it from the [official Maven website](https://maven.apache.org/download.cgi).

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the project**:
    After building the project, you can run the application using:
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**:
    Open your browser and navigate to `http://localhost:8080` to interact with the application.

## Usage

Here’s an example of how the game runs:

```java
public class GameRunner {
    public static void main(String[] args) {
        Pacman pacman = new Pacman();
        SuperMario superMario = new SuperMario();

        GameConsole gameConsole = new GameConsole(pacman, superMario);
        gameConsole.startGame();
    }
}
```

### Expected Output:
The game starts, and you'll see output for the game's initial status, Pacman’s actions, and interactions with other characters like SuperMario.

## Features

- **GameConsole**: Manages the flow of the game and allows the user to start and control the game.
- **Pacman**: Implements the behavior and actions for the Pacman character.
- **SuperMario**: A placeholder for a potential Mario character.
- **Spring Boot Setup**: The project is built as a Spring Boot application with necessary configurations and dependencies.

## Contributing

We welcome contributions to improve this project. If you want to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to your branch (`git push origin feature-branch`).
6. Create a pull request.

### Guidelines:
- Follow the existing code style.
- Write tests for any new features or bug fixes.
- Ensure the project builds successfully with `mvn clean install`.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact Information

For any questions or feedback, feel free to reach out:

- **Email**: rishugupta8104@gmail.com

## Acknowledgements

- **Spring Boot**: For simplifying the setup and providing an easy way to run Java applications.
- **Maven**: For managing project dependencies and building the project.
- **Pacman**: The classic game used as a template for this project.
