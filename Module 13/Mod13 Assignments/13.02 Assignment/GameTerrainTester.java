
/**
 * Tester class for the Terrain Class hierarchy, which displays information
 * about different terrains to simulate a game.
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class GameTerrainTester
{
    public static void main(String[] args)
    {
        //create Objects for all the terrains
        Terrain mainland = new Terrain(350, 225);
        Mountain mountain = new Mountain(500, 425, 36);
        WinterMountain wintMount = new WinterMountain(200, 150, 10, 2);
        Forest forest = new Forest(1000, 800, 900);
        Ocean ocean = new Ocean(2000, 3480, 21926);
        Lake lake = new Lake(500, 550, 1200);

        System.out.println("The Main " + mainland.getTerrainSize() + ".\n");
        System.out.println("The Mountain " + mountain.getTerrainSize() + " and there are " + mountain.getMountains() + " mountains.\n");
        System.out.println("The Winter Mountain " + wintMount.getTerrainSize() + ", there are " + wintMount.getMountains() + " mountains, and the temperature is " + wintMount.getTemp() + " degrees Fahrenheit.\n");
        System.out.println("The Forest " + forest.getTerrainSize() + " and there are " + forest.getTrees() + " trees.\n");
        System.out.println("The Ocean " + ocean.getTerrainSize() + " and there are " + ocean.getFish() + " fish in it.\n");
        System.out.println("The Lake " + lake.getTerrainSize() + " and there are " + lake.getAnimals() + " animals in or near the lake.");
    }
}
