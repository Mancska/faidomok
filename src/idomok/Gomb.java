
package idomok;

public class Gomb {
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }
   
    public double terfogat(){
        
        return 1.33*3.14159*(sugar*sugar*sugar);
        
    }

    @Override
    public String toString() {
        return "Gomb{" +"térfogat="+terfogat()+'}';
    }
    
}
