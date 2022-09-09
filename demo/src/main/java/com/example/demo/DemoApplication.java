package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.game.GameRunner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// MarioGame,SuperContraGame Context selector
		GameRunner runner = context.getBean(GameRunner.class);

		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		// GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
