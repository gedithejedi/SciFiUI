package ie.tudublin;

import processing.core.PApplet;

public class UiLayout
{
	UI ui;
	private float x;
	
	public UiLayout(UI ui, float x)
    {
		this.ui = ui;
		this.x = x;
    }

    public void render()
    {
			//Drawing the top left part
			ui.stroke(255,0,0);
			ui.line(0, 135, 185, 110);
			ui.line(185, 110, 240, 40);
			ui.line(240, 40, 208, 0);
			//drawing the top middle part
			ui.line(175, 0, 235, 67);
			ui.line(235, 67, 510, 77);
			ui.line(510, 77, 790, 68);
			ui.line(790, 68, 852, 0);
			//Draring the top right part
			ui.line(817, 0, 785, 39);
			ui.line(785, 39, 840, 110);
			ui.line(840, 110, 1025, 135);
			
			//drawing the bottom outlines up to radar
			ui.line(0, 377, 20, 372);
			ui.line(20, 372, 100, 430);
			ui.line(100, 430, 120, 400);
			//lines comming from the radar
			ui.line(260, 490, 357, 516);
			ui.line(357, 516, 400, 475);
			ui.line(400, 475, 625, 475);
			ui.line(625, 475, 666, 516);
			ui.line(666, 516, 870, 455);
			ui.line(870, 455, 1005, 372);
			ui.line(1005, 372, 1025, 377);
	}
}