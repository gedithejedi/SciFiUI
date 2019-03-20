package ie.tudublin;

import processing.core.PApplet;

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
        ui.noFill();
        ui.stroke(255);
		ui.ellipse(x, y, diameter, diameter);
		ui.fill(255);
		//making the line
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