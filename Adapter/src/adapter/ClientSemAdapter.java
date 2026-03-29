package adapter;

// https://medium.com/@aashna.chourasia.2/adapter-design-pattern-34b6da192489

public class ClientSemAdapter {
    public static void main(String args[]) {
    	Vehicle bugattiVeyron = new BugattiVeyron();
 	
    	System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyron.getSpeed() + " Mph.");

        Vehicle mcLaren = new McLaren();
        System.out.println("McLaren F1 top speed is " + mcLaren.getSpeed() + " Mph.");

        Vehicle astonMartin = new AstonMartin();
        System.out.println("Aston Martin top speed is " + astonMartin.getSpeed() + " Mph.");

        AutomavelBrasileiro meuToyota = new ToyotaCross();

        Vehicle ToyotaCompativel = new AdapterBrasileiro(meuToyota);
        System.out.println("Toyota cross top speed is " + ToyotaCompativel.getSpeed() + " Mph.");
        
    }
}
