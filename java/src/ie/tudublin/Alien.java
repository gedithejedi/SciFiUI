package ie.tudublin;
import processing.core.PApplet;
import processing.data.TableRow;

public class Alien
{
    private String name;
    private String planet;
    private String superp;

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
     * @return the superp
     */
    public String getSuperp() {
        return superp;
    }

    /**
     * @param superp the superp to set
     */
    public void setSuperp(String superp) {
        this.superp = superp;
    }
   
   public String toString()
   {
       return name + "\t" + superp + "\t" + planet;
   } 

   public Alien(TableRow row)
   {
    name = row.getString("Name");
    planet = row.getString("Planet of origin");
    superp = row.getString("Superpower");
   }
}