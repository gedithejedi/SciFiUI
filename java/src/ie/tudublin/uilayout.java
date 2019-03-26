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
			ui.line(0, 133, 190, 108);
			ui.line(190, 108, 240, 40);
			ui.line(240, 40, 205, 0);
			//drawing the top middle part
			ui.line(175, 0, 230, 65);
			ui.line(230, 65, 510, 80);
			ui.line(510, 80, 790, 65);
			ui.line(790, 65, 850, 0);
			//Draring the top right part
			ui.line(820, 0, 785, 40);
			ui.line(785, 40, 840, 108);
			ui.line(840, 108, 1025, 133);
		}
}