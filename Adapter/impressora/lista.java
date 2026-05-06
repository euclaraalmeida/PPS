package impressora;

public class lista {

    // Contexto
class Ordenador {
    
        private Innerlista innerlista;

        public Ordenador( Innerlista innerlista){
            this.innerlista = innerlista;
        }

        public void Ordenar(int[] lista){
            innerlista.ordenar(lista);
        }

    
}

//interface 
public interface Innerlista {
    void ordenar(int[] lista); 
}

// Estratégia 1
public class ordenarCrescente implements Innerlista{
    public void ordenar(int[] lista) {
        System.out.println("Ordenando de forma crescente");
        }
    }

// Estratégia 2
public class ordenarDecrescente implements Innerlista{
    public void ordenar(int[] lista) {
        System.out.println("Ordenando de forma decrescente");
    }
}   

// Estratégia 3
public class ordenarAlfabetico implements Innerlista{
    public void ordenar(int[] lista) {
        System.out.println("Ordenando de forma alfabética");
    }
}

public class main {
    public static void main(String[] args) {
        listy = [1,2,3,4,5];
        ordenarCrescente  oCrescente = new ordenarCrescente();
        ordenarDecrescente  Dcrescente = new ordenarDecrescente();

        Ordenador ordenador = new Ordenador(oCrescente);

        ordenador.Ordenar(listy);

        Ordenador ordenador2 = new Ordenador(Dcrescente);
        ordenador2.Ordenar(listy);





        
    }
}


}
