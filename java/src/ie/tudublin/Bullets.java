package ie.tudublin;

import processing.core.PApplet;

public class Bullets
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private int Bullets;
	
    public Bullets(UI ui)
    {
        this.ui = ui;
        this.x = 850;
        this.y = 20;
        this.width = 150;
        this.height = 100;
        this.Bullets = 300;
    }
    
    public void render()
    {
		ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(Bullets, x + width * 0.5f, y + height * 0.5f);
    }

    public void update()
    {

    }
}
