
//Decorador Base
public abstract class AdicionalHandler implements CafeInt {
 
	protected CafeInt proximo;

   
    public void setNext(CafeInt proximo) {
        this.proximo = proximo ;
    }
    public abstract String getDescricao() ;  

    public abstract double getCusto(); 
}
