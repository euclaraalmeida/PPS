public class Vermelho implements Estado {
     protected Semaforo semaforo;

    Vermelho(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public void exibir() {
        System.out.println("vermelho");

        Verde novo = new verde();
        semaforo.changeState(novo);
    };
}
