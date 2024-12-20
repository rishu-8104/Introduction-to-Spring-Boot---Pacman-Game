package fi.sade23.spring.pacman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacmanApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(PacmanApplication.class, args);
		System.out.println("===PLAYING GAME WITH SPRING BOOT=== \n");
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();
	}

}
