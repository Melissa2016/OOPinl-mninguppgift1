package husdjurhotel;

public  class Hund extends Djur implements viktportionsort,sort   {
//instanse variable 
    
  
    public Hund(String sort,int vikt ){
     super(sort,vikt);
    }
public double hundfordenigram;
//kostruktor 



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

