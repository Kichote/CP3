

public class Lamps
{
    boolean isLampOn;
        
    void switchOn()
    {   
        isLampOn = true;    
    }
    void switchOff()
    { 
        isLampOn = false;       
    }
    void displayLampInfo()
    {
        System.out.println("Is lamp on: "+ isLampOn);
    }
}
