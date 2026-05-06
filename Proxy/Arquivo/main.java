public class main {
    public static void main(String[] args) {
        Arquivo user1 = new Proxy("admin");
        user1.lerConteudo();
        Arquivo user2 = new Proxy("NÃOaUTORIZADO");
        user2.lerConteudo();
    }
}
