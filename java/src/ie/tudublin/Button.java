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
	// Coordinates for the alien hitboxes
    private float xl;
    private float yl;
    private float xl2;
    private float yl2;
	private int health;
	// Initialising the string variables for csv file
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
		// Setting the string variables value from csv file
		this.name1 = name1;
		this.planet1 = planet1;
		this.superp1 = superp1; 
		this.name2 = name2;
		this.planet2 = planet2;
		this.superp2 = superp2;
		// Setting the coordinates value for the alien hitboxes
        xl = 340;
        yl = 240;
        xl2 = 100;
        yl2 = 180;
		health = 120;
    }

	// The render function
    public void render()
    {
		// The status bar at the top of the screen
		//If the health is more than 60 display this
		if(health > 60)
		{
			ui.textSize(40);
			ui.fill(0,255,0);
			ui.text("Status : Great Condition", 512, 30);
		}
		//if the health is between 40 and 60 display this
		else if(health > 20 && health < 60 )
		{
			ui.textSize(40);
			ui.fill(255,255,0);
			ui.text("Status : Good Condition", 512, 30);
		}
		// If the health is less than 40 display this
		else if(health < 20)
		{
			ui.textSize(40);
			ui.fill(255,0,0);
			ui.text("Status : Critical Condition", 512, 30);
		}
		//if the health is more than 0 all of this is runnable
		if(health > 0)
		{
			//Creates the hitboxes for the aliens
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
			//if you hover over the left alien display info about the alien that is loaded from a CSV file
			if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
			{
                ui.fill(79, 142, 236);
                ui.textSize(20);
                ui.text("Planet of origin: " + planet1, 500, 500); 
                ui.text("Name: " + name1, 500, 520);
                ui.text("Superpower: " + superp1, 500, 540);
			}
			//If you hover ouver the right alien display the aliens info that is loaded from a csv file
			if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
			{
                ui.fill(79, 142, 236);
                ui.textSize(20);
                ui.text("Planet of origin: " + planet2, 500, 500); 
                ui.text("Name: " + name2, 500, 520); 
                ui.text("Superpower: " + superp2, 500, 540);
			}
			//Set the text size to be bigger
			ui.textSize(20);
			//If mouse is pressed in between any of the specified coordinates in both if statements
			if(ui.mousePressed)
			{
				//If you shoot in between coordinates of alien 1 do this
				if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
				{  
					// brings down the robots health by 1 every frame
					health --;
					ui.fill(79, 142, 236);
					//Print this to the robot
					ui.text("He hits you back!", ui.mouseX + 150, ui.mouseY);
				}
				//If you shoot in between coordinates of alien 2 do this
				if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
				{
					// brings down the robots health by 2 every frame
					health --;
					ui.fill(79, 142, 236);
					//Print this to the robot
					ui.text("He hits you back!", ui.mouseX + 150, ui.mouseY);
				}
			}
		}
		//If health is 0 display a new screen with the output of SYSTEM FAILED
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