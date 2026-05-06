public class handlePresidente  extends handleAbstrato{

    public void aprovar(String request){
        if (request.equals("10000")){
            System.out.println("presidente aprovou");
        }else if(next!=null){
            next.aprovar(request);
        }
    }
    
}