package view;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Board guitarraTest = new Board(0,0, 3, 4); 
	Board guitarraTest2 = new Board(200,0, 3, 4); 
	
	Board guitarraTest5 = new Board(600,0, 6, 7); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	public void settings() {
		size(1500, 1000); 

	}

	public void setup() {
		guitarraTest.appInstance(this);
		guitarraTest2.appInstance(this);
		
		guitarraTest5.appInstance(this);
		

	}

	public void draw() {
		background(255,255,0); 
		guitarraTest.paintIt();
		guitarraTest2.paintIt();
		guitarraTest5.paintIt();
		

	}

}
