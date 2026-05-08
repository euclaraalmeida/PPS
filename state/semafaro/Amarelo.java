public class Amarelo  implements Estado{
    protected Semaforo semaforo;

    Amarelo(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public void exibir() {
        System.out.println("amarelo");

        Vermelho novo = new Vermelho();
        semaforo.changeState(novo);
    };
}
