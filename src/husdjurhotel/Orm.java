
package husdjurhotel;


public  class Orm  extends Djur implements viktportionsort,sort{
    
 //kostruktor 
    public Orm(String sort,int vikt ){
     super(sort,vikt);
    }

   //inkapsling 
    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getVäger() {
        return vikt;
    }

    public void setVäger(int vikt) {
            
        this.vikt = vikt ;
    }

   

    /*här skriver jag metoder som finns i interface viktportionsort och sortmat
  på det här sättet som jag behöver att vara.*/   
   // dynamiskbuldning
    
    @Override
    public double viktportion(int vikt) {
      int  ormpellets=20;
      return  ormpellets;
        
    }
 public String getSort() {
        return sort;
    }
 @Override
    public String sortmat() {
        return "Ormepellets";
    }
     
    
}
