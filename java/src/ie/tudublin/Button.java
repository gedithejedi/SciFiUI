package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float xl;
    private float yl;
    private float xl2;
    private float yl2;
	private int health;

    public Button(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        xl = 340;
        yl = 240;
        xl2 = 100;
        yl2 = 180;
		health = 120;
    }

    public void render()
    {
		if(health > 0)
		{
			ui.noFill();
			ui.noStroke();
			ui.rect(x, y, width, height);
			ui.rect(xl, yl, xl2, yl2);
			ui.textAlign(PApplet.CENTER, PApplet.CENTER);
			//health bar precentage
			ui.fill(77, 77, 255);
			ui.textSize(10);
			ui.text(health +"/120", 170, 70);
			//making the red health bar
			ui.fill(255,0,0);
			ui.rect(20, 60, health, 20);
			
			if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
			{
				ui.text("You just hovered over me me", xl + 30, yl - 25); 
			}
		
			if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
			{
				ui.text("You just hovered over me me", x + 30, y - 25);
			}
			
			ui.textSize(20);
			
			if(ui.mousePressed)
			{
				if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
				{  
					health --;
					ui.text("He hits you back!", ui.mouseX + 150, ui.mouseY);
				}
				
				if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
				{
					health --;
					ui.text("He hits you back!", ui.mouseX + 150, ui.mouseY);
				}
			}
		}
		else
		{	
			ui.fill(0);
			ui.noStroke();
			ui.rect(0, 0, 1025, 576);
			ui.fill(255,0,0);
			ui.textSize(50);
			ui.text("YOU DIED", 1025/2, 576/2);
			
		}
         
    }
}