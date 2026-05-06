import java.util.HashMap;
import java.util.Map;

public class BancoProxy implements BancoDeDados {
    private BancoDeDadosReal bancoDeDadosReal;
    private Map<String, String> cache = new HashMap<>();

    public BancoProxy(){
        this.bancoDeDadosReal = new BancoDeDadosReal();
    }

    public String buscar(String dado) {
        if(!cache.containsKey(dado)) {
            resultado = bancoDeDadosReal.buscar(dado);
            cache.put(dado, resultado);
            return resultado;
        }
        return cache.get(dado);
    }
}
