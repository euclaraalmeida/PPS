package adapter;

public class AdapterBrasileiro implements Vehicle {
    private AutomavelBrasileiro carroBR;

    
    public AdapterBrasileiro(AutomavelBrasileiro carroBr){
        this.carroBR = carroBr;
    }

    @Override
   public double getSpeed(){
        return (carroBR.getVelocidadeKmh(true)) * 6.15;
   }
}