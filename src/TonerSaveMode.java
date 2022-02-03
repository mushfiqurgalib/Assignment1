/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TonerSaveMode extends PrintMode {
    private String tonerSavingLevel;

    public String getTonerSavingLevel() {
        return tonerSavingLevel;
    }

    public void setTonerSavingLevel(String tonerSavingLevel) {
        this.tonerSavingLevel = tonerSavingLevel;
    }

    public void saveToner(String tonerSavingLevel)
    {
    if(tonerSavingLevel.equals("high")){
        System.out.println("Lowered");
    }
    else if(tonerSavingLevel.equals("medium")){
        System.out.println("Slightly Highred");
    }
    else if(tonerSavingLevel.equals("low")){
        System.out.println("Highered");
    }
    }
    
 /*
      moved this method from PrintMode.java Class as it is not needed in any other child of PrintMode other than
      Toner saver mode. So It would have violated the Interface Segregation Principle.
      */
   
    
}
