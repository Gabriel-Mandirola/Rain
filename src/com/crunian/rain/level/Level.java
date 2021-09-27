package com.crunian.rain.level;

import com.crunian.rain.graphics.Screen;

public class Level {

	private int widht, height;
	private int [] tiles;
	
	public Level(int width, int height) {
		this.widht = width;
		this.height = height;
		tiles = new int [width * height];
		generateLevel();
	}
	
	public Level(String path) {
		loadLevel(path);
	}
	
	private void generateLevel() {
	}
	
	private void loadLevel(String path) {
	}
	
	public void update() {
	}
	
	private void time() {
	}
	
	public void render(int x, int y, Screen screen) {
	}
	
}
