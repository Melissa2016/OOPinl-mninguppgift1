package husdjurhotel;

public class Katt extends Djur implements viktportionsort, sort {

    //instanse variable 
    public Katt(String sort, int vikt) {
        super(sort, vikt);
    }
    public double kattfordenigram;
//kostruktor 

    public void setSort(String sort) {
        this.sort = sort; 
    }

    public String getSort() {
        return this.sort;
    }

    public void setVägar(int vikt) {

        this.vikt = vikt;
    }

    public int getVägar() {
        return this.vikt;    
    }

    @Override   
    public double viktportion(int vikt) {   
        this.vikt = vikt * 1000;
        this.kattfordenigram = this.vikt/150;
        return this.kattfordenigram;

    }

    @Override
    public String sortmat() {
        return "Kattfoder";
    }

}
