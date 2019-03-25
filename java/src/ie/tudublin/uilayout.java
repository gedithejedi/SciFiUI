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
		ui.rect(50, 10, 100, 200); // tlx, tly, w, h
			
	}
}