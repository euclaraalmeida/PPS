public class main {
    public static void main(String[] args) {
        handleAbstrato h1 = new handleDiretor();
        handleAbstrato h2 = new handleGerente();
        handleAbstrato  h3 = new handlePresidente();

        h1.setNext(h2);
        h2.setNext(h3);

        h1.aprovar("9000");
        h1.aprovar("5000");
        h2.aprovar("10000");
    }
}
