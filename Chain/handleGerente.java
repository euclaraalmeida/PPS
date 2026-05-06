public class handleGerente extends handleAbstrato{
    public void aprovar(String request){
        if (request.equals("5000")){
        System.out.println("Gerente aprovou");}
        else if (next!=null){
            next.aprovar(request);
        }
        }
    }


    
