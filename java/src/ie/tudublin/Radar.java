package ie.tudublin;

import processing.core.PApplet;
import java.awt.Font;

public class Radar
{
	UI ui;
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
	private float lx;
	private float ly;
	private float angle;
    

	public Radar(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
		lx = x;
		ly = y;
    }

    public void render()
    {
		//making the circle
    	//making the colour of the line black
      		ui.stroke(0);
			ui.strokeWeight(2);
			ui.fill(0);
			ui.ellipse(x, y, diameter + 20, diameter + 20);
			//making the fill of inner circle blue
			ui.fill(77, 77, 255);
			ui.ellipse(x, y, diameter, diameter);
			//circles inside the radar
			ui.stroke(89,89,89);
			ui.ellipse(x, y, diameter - 20, diameter - 20);
			ui.ellipse(x, y, diameter - 50, diameter - 50);
			ui.ellipse(x, y, diameter - 70, diameter - 70);
			ui.ellipse(x, y, diameter - 90, diameter - 90);
			//adding the red dots
			ui.fill(255,0,0);
			ui.ellipse(x + 5, y - 40, 5, 5);
			ui.ellipse(x + 50, y - 45, 5, 5);
			//making the line
			//colour of line red
			ui.stroke(255,0,0);
			ui.line(x, y, lx, ly);		

		}
	
	//making the line go around
	    public void updateline()
    {
			angle += 0.05;
			ly +=(radius *(Math.sin(angle)));
			lx += (radius *(Math.cos(angle)));
    }
	
	//reseting the x and y coordinates so the line does not get bigger
	public void resetline()
	{
		//resseting the x and y coordinates to original
		ly = y;
		lx = x;
	}
}