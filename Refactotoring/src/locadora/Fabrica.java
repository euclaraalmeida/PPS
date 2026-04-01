package locadora;

public class Fabrica {

    public Classificacao create(int codigoDoPreco){

        switch (codigoDoPreco) {
                    case Automovel.FAMILIA:
                        return new Familia();
                    case Automovel.LUXO:
                         return new Luxo();
                    case Automovel.BASICO:
                        return new Basico();
                    default:
                       return new Basico();
                }
                
}}
