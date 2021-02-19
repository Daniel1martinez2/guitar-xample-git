package view;

import processing.core.PApplet;

public class Note {

	int x, y, tamX, tamY, aumentoX, aumentoY; 
	PApplet app; 
	String id; 
	public Note(int x, int y) {
		this.x = x; 
		this.y = y; 	
		
	}
	
	public void bringBoardScale( int tamX, int tamY, int aumentoX, int aumentoY) {
		this.tamX = tamX; 
		this.tamY = tamY; 
		this.aumentoX = aumentoX; 
		this.aumentoY = aumentoY; 
		
	}
	public void moved(int stop) {
		
		if(app.frameCount%30==0) {
			if(y+1 < stop) {
				
				y+=1;
			}
		}
	
	}
	
	public void paintNote() {
		app.fill(0,255,255);
		app.rect(aumentoX+(x*tamX), aumentoY+(y*tamY), tamX, tamY);
	}
	public void appInstance(PApplet app) {
		this.app = app; 
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
