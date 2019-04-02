package ie.dit;

import processing.data.*;

public class Alien
{
    private String name;
    private String planet;
    private String superpower;

    public Alien(String name, String planet, String superpower)
    {
        this.name = name;
        this.planet = planet;
        this.superpower = superpower;
    }

    public Product(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Name"), tr.getString("Planet"), tr.getString("Planet";)
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the planet
     */
    public String getPlanet() {
        return planet;
    }

    /**
     * @param planet the planet to set
     */
    public void setPlanet(String planet) {
        this.planet = planet;
    }

    /**
     * @return the superpower
     */
    public String getSuperpower() {
        return superpower;
    }

    /**
     * @param superpower the superpower to set
     */
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

  

    
}