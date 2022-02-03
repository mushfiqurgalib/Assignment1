
public abstract class PrintMode {
    
    private double costPerPage;
    //private int numberOfPages;
    //private int pageSize;
    //private String orientation;
    //private double colorIntensity;
    /*removed these because they violate single responsibility principle */
    public double getCostPerPage() {
        return costPerPage;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }
    

    
  //  public abstract void saveToner();
   // public abstract void savePage();
   // public abstract void Boost();
    /*moved these methods,otherwise it will break Interface Segregation principle*/
}
