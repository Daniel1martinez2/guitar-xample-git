package view;

import processing.core.PApplet;

public class Board {
	PApplet app; 
	Note re; 
	Note f; 
	int x,y, filas, columnas, tamX, tamY; 
	public Board(int x, int y, int filas, int columnas) {
		
		this.columnas= columnas;
		this.filas = filas; 
		tamX  = 50;
		tamY = 100; 
		this.x = x; 
		this.y = y; 
		re = new Note(0,0); 
		re.bringBoardScale(tamX, tamY, x, y); 
		f = new Note(0,1); 
		f.bringBoardScale(tamX, tamY, x, y); 
		
		
			
	}
	
	public void paintIt() {
		
		for(int i = 0; i<columnas; i++) {
			for(int o = 0 ; o < filas; o++) {
				app.fill(255,0,255); 
				app.rect((i*tamX)+x, (o*tamY)+y, tamX, tamY);
			}
		}
		re.paintNote();
		re.moved(3);
		
		f.paintNote();
		f.moved(5);
	}
	
	public void appInstance(PApplet app) {
		this.app = app; 
		re.appInstance(app);
		f.appInstance(app);
		
	}
	
}

