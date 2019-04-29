package ie.tudublin;

import processing.core.PApplet;
import java.awt.Graphics;

public class Bullets
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private int Bullets;
	//shooting vars
	private float sx;
    private float sy;
    private float swidth;
    private float sheight;

    public Bullets(UI ui)
    {
        this.ui = ui;
        this.x = 850;
        this.y = 20;
        this.width = 150;
        this.height = 100;
        this.Bullets = 150;
		//shooting vars
		this.sx = 0;
        this.sy = 0;
        //Setting the values for screen heght and screen width
        this.swidth = 1025;
        this.sheight = 576;
    }
    
    public void render()
    {
		ui.noFill();
        ui.noStroke();
        //Making the rectangle to fil the screen to have it as a button so you could shoot anywhere
        ui.rect(x, y, width, height);
		ui.textSize(30);
        ui.fill(77, 77, 255);
        //the ammo count at the top right of the screen
		ui.text("Ammo", x + width * 0.5f, y + height * 0.1f);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(50);
        //Displays the bullet count
        ui.text(Bullets, x + width * 0.5f, y + height * 0.5f);
    }

    public void shoot()
    {
		ui.stroke(255,0,0);
		ui.fill(255,0,0);
		ui.strokeWeight(1);
		
		if(ui.mousePressed)
        {
            //If you click anywhere on the screen the laser shoots 
            if(ui.mouseX > sx && ui.mouseX < sx + swidth && ui.mouseY > sy && ui.mouseY < sy + sheight)
            {
                //The red circle where the laser lands
                ui.ellipse(ui.mouseX, ui.mouseY, 10, 10);
                //The laser is drawn
                ui.line(swidth/2,sheight,ui.mouseX,ui.mouseY);
                //If bullets is more than 0 and mouse is pressed decrement by 1 every frame
				if(Bullets > 0)
				{
					Bullets --;
                }
                //Else there is no bullets and delay is made before reloading
				else
				{
					ui.delay(500);
					Bullets = 150;
				}
            }
        } 

    }
}
