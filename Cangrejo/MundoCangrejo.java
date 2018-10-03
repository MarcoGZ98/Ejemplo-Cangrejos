import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MundoCangrejo extends World
{
    private Lobster lobster;
    private Crab crab;
    private GreenfootSound musica; 
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MundoCangrejo(int totalGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        Lobster langosta = new Lobster();
        addObject(langosta,62,368);
        Crab crab = new Crab();
        addObject(crab,293,274);
        prepare(totalGusanos);
        musica = new GreenfootSound("ufo-t-balt.mp3");
    }
    
    public void started()
    {
        //Greenfoot.playSound("ufo-t-balt.mp3");
        musica.playLoop();
    }
    
    public void stopped()
    {
        musica.pause();
    }

    public Lobster accedeLangosta()
    {
	return lobster;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int numGusanos)
    {
        for(int i = 0; i < numGusanos; i++){
            Worm w = new Worm();
            int x = Greenfoot.getRandomNumber(520 + 20);
            int y = Greenfoot.getRandomNumber(520 + 20);
            addObject(w, x, y);
        }
        /*
        Worm worm = new Worm();
        addObject(worm,506,87);
        Worm worm2 = new Worm();
        addObject(worm2,128,163);
        Worm worm3 = new Worm();
        addObject(worm3,283,56);
        Worm worm4 = new Worm();
        addObject(worm4,478,195);
        Worm worm5 = new Worm();
        addObject(worm5,260,175);
        Worm worm6 = new Worm();
        addObject(worm6,391,313);
        Worm worm7 = new Worm();
        addObject(worm7,194,289);
        Worm worm8 = new Worm();
        addObject(worm8,378,157);
        worm5.setLocation(168,82);
        worm8.setLocation(391,123);
        crab.setLocation(291,231);
        worm7.setLocation(69,357);
        Worm worm9 = new Worm();
        addObject(worm9,238,323);
        Worm worm10 = new Worm();
        addObject(worm10,519,327);
        worm.setLocation(558,99);
        worm8.setLocation(428,89);
        worm4.setLocation(397,202);
        worm10.setLocation(532,253);
        worm6.setLocation(439,350);
        worm9.setLocation(221,329);
        worm9.setLocation(241,342);
        worm7.setLocation(149,279); */ 
        
    }
}
