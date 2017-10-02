/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husdjurhotel;

/**
 *
 * @author NN
 */
public  class Orm  extends Djur implements viktportionsort,sort{
    
  
   
    public Orm(String sort,int vikt ){
     super(sort,vikt);
    }

   

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getVäger() {
        return vikt;
    }

    public void setVäger(int vikt) {
            
        this.vikt = vikt ;
    }


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
