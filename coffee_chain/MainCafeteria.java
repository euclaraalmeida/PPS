
// Cliente mudar para o chain
public class MainCafeteria {
    public static void main(String[] args) {
    	
        // Caf� simples com leite e chantilly
        CafeInt cafe = new CafeSimples();
        AdicionalHandler add1 = new Leite();
        AdicionalHandler add2 = new Chantilly();
        cafe.setNext(add1);
        add1.setNext(add2);
        

        System.out.println(cafe.getDescricao()+ " - R$" + cafe.getCusto());// cafe 3 reais 

       
    
        
    }
}
