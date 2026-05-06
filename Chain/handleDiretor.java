public class handleDiretor extends handleAbstrato {

    public void aprovar(String request ){
        if(request.equals("9000")){
            System.out.println("Diretor aprovou");
        }else if (next!=null){
            next.aprovar(request);
        }
    }


}
