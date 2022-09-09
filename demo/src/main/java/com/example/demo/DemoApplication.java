package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.game.GameRunner;
import com.example.demo.game.SuperContraGame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		// MarioGame game = new MarioGame();
		SuperContraGame contra = new SuperContraGame();
		GameRunner runner = new GameRunner(contra);
		runner.runGame();
	}

}
