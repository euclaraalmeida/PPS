// Objeto Real
public class BancoDeDadosReal implements BancoDeDados {
    public String buscar(String dado) {
        System.out.println("Buscando no banco: " + dado);
        return "Resultado: " + dado;
    }

}