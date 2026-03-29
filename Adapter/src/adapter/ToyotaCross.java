package adapter;

public class ToyotaCross implements AutomavelBrasileiro
{
   

    public double getVelocidadeKmh(boolean turbo){
        double velocidade = 229;
        if(turbo){
            velocidade = velocidade * 1.3;
        }
        return velocidade;
    }
}
