package ie.tudublin;

import processing.core.PApplet;
import java.awt.Font;
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
		//shotting vars
		this.sx = 0;
        this.sy = 0;
        this.swidth = 1025;
        this.sheight = 576;
    }
    
    public void render()
    {
		ui.noFill();
        ui.noStroke();
        ui.rect(x, y, width, height);
		ui.textSize(30);
		ui.fill(77, 77, 255);
		ui.text("Ammo", x + width * 0.5f, y + height * 0.1f);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
		ui.textSize(50);
        ui.text(Bullets, x + width * 0.5f, y + height * 0.5f);
    }

    public void shoot()
    {
		ui.stroke(255,0,0);
		ui.fill(255,0,0);
		ui.strokeWeight(1);
		
		if(ui.mousePressed)
        {
			//size(1025, 576);
            if(ui.mouseX > sx && ui.mouseX < sx + swidth && ui.mouseY > sy && ui.mouseY < sy + sheight)
            {
                ui.ellipse(ui.mouseX, ui.mouseY, 10, 10);
                ui.line(swidth/2,sheight,ui.mouseX,ui.mouseY);
				if(Bullets > 0)
				{
					Bullets --;
				}
				else
				{
					
					try 
					{
						Thread.sleep(2000);
					} 
					catch(InterruptedException e)
					{
					
					}
					Bullets = 150;
				}
            }
        } 

    }
}
