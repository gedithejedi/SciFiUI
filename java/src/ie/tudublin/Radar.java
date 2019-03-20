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
	
	    public void updateline()
    {
		angle += 0.01;
		ly +=(radius *(Math.sin(angle)));
		lx += (radius *(Math.cos(angle)));
    }
	
	public void resetline()
	{
		ly = y;
		lx = x;
	}
}