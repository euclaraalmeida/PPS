public class Verde implements Estado {
    protected Semaforo semaforo;

    verde(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public void exibir() {
        System.out.println("verde");
        Amarelo novo = new Amarelo();
        semaforo.changeState(novo);
    };
}
