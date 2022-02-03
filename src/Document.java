
public class Document {
     private double costPerPage;
    private int numberOfPages;
    private int pageSize;
    private String orientation;
    private double colorIntensity;
 /*
      added these variables here from PrintMode because they are needed to specify a document not a print mode.
      So these variables violated the Single Responsibility principle.
      */

    public double getCostPerPage() {
        return costPerPage;
    }

    public Document(double costPerPage, int numberOfPages, int pageSize, String orientation, double colorIntensity) {
        this.costPerPage = costPerPage;
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.colorIntensity = colorIntensity;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public void setColorIntensity(double colorIntensity) {
        this.colorIntensity = colorIntensity;
    }
}
