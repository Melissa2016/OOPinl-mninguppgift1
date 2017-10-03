package husdjurhotel;
/* subklassen Katt ärver Djur och har två interfaces viktportionsort, sort

*/
public class Katt extends Djur implements viktportionsort, sort {

 public double kattfordenigram;
 
//kostruktor   
    public Katt(String sort, int vikt) {
        super(sort, vikt);
    }
   
//inkapsling

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

    /* här skriver jag metoder som finns i interface viktportionsort och sortmat
    på det här sättet som jag behöver att vara.
    
    */
    // dynamiskbuldning
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
