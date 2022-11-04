package com.practice.flappy;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.practice.flappy.FlappyBird;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(FlappyBird.WIDTH,FlappyBird.HEIGHT);
		config.setTitle(FlappyBird.TITLE);
		new Lwjgl3Application(new FlappyBird(), config);
	}
}
