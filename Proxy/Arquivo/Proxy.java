public class Proxy implements Arquivo{
    private ArquivoConfidencial arquivoConfidencial;
    private String usuario;

    public Proxy(String usuario){ // aqui passamos 1 parametro
        this.usuario = usuario;
        this.arquivoConfidencial = new ArquivoConfidencial();
    }

    @Override
    public void lerConteudo(){
        if(usuario.equals("admin")){
        arquivoConfidencial.lerConteudo();
    }else{
        System.out.println("acesso negado");
    }
    }
    

    
}
