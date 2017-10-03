package husdjurhotel;



/*Subklass Hund som ärver superklass Djur och har  två interface
viktportionsort och sort .
  */


public  class Hund extends Djur implements viktportionsort,sort   {
public double hundfordenigram;
//kostruktor 
    public Hund(String sort,int vikt ){
     super(sort,vikt);
    }

//Inkapslig 
    public void setSort(String sort) {
        this.sort = sort;
    }
      public String getSort() {
        return this. sort;
      }
   public void setVägar(int vikt) {

        this.vikt=vikt ;
    }

    public int getVägar() {
        return this.vikt;
    }

  /* här skriver jag metoder som finns i interface viktportionsort och sort
    på det här sättet som jag behöver att vara.
    
*/
    // dynamiskbuldning
    @Override
    public double  viktportion(int vikt) {
        this.vikt=vikt*1000;
this. hundfordenigram=this.vikt/100;
return this.hundfordenigram ;

    }
    
    @Override
    public String sortmat() {
        return "Hundfoder";
    }

}

