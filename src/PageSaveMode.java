/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PageSaveMode extends PrintMode{
private String updatedDocument;
  public String getUpdatedDocument() {
        return updatedDocument;
    }

    public void setUpdatedDocument(String updatedDocument) {
        this.updatedDocument = updatedDocument;
    }
    
    public void renderPreview(String updatedDocument){
        
       
        System.out.println("updated");
    }

  
    

   
    public void savePage() {
        System.out.println("pagesize changed");
        System.out.println("number of page reduced");
    }
 /*
      moved this method from PrintMode.java Class as it is not needed in any other child of PrintMode other than
      PageSavingMode. So It would have violated the Interface Segregation Principle.
      */
 
    
}
