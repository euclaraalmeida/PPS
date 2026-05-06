public abstract class handleAbstrato  implements HandleInt{
    protected HandleInt next;
    public void  setNext(HandleInt next){
        this.next = next;
    };


  public abstract void aprovar(String request);

}