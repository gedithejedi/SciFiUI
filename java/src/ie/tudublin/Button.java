package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class Button extends PApplet
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
	private String name1;
	private String planet1;
	private String superp1;
	private String name2;
	private String planet2;
	private String superp2;

    public Button(UI ui, float x, float y, float width, float height, String name1, String planet1, String superp1, String name2, String planet2, String superp2)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
		this.height = height;
		this.name1 = name1;
		this.planet1 = planet1;
		this.superp1 = superp1; 
		this.name2 = name2;
		this.planet2 = planet2;
		this.superp2 = superp2;
        xl = 340;
        yl = 240;
        xl2 = 100;
        yl2 = 180;
		health = 120;
    }

    public void render()
    {
		
		if(health > 60)
		{
			ui.textSize(40);
			ui.fill(0,255,0);
			ui.text("Status : Great Condition", 512, 30);
		}
		else if(health > 20 && health < 60 )
		{
			ui.textSize(40);
			ui.fill(255,255,0);
			ui.text("Status : Good Condition", 512, 30);
		}
		else if(health < 20)
		{
			ui.textSize(40);
			ui.fill(255,0,0);
			ui.text("Status : Critical Condition", 512, 30);
		}
		
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
                ui.fill(79, 142, 236);
                ui.textSize(20);
                ui.text("Planet of origin: " + planet1, 500, 500); 
                ui.text("Name: " + name1, 500, 520);
                ui.text("Superpower: " + superp1, 500, 540);
			}
			
			if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
			{
                ui.fill(79, 142, 236);
                ui.textSize(20);
                ui.text("Planet of origin: " + planet2, 500, 500); 
                ui.text("Name: " + name2, 500, 520); 
                ui.text("Superpower: " + superp2, 500, 540);
			}
			
			ui.textSize(20);
			
			if(ui.mousePressed)
			{
				if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
				{  
					health --;
					ui.fill(79, 142, 236);
					ui.text("He hits you back!", ui.mouseX + 150, ui.mouseY);
				}
				
				if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
				{
					health --;
					ui.fill(79, 142, 236);
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
			ui.text("System Failed", 1025/2, 576/2);
			
		}
         
	}
	
}