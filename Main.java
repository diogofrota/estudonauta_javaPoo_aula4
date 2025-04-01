import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("verde", "cinza");

        c1.setModelo("bic");
        System.out.println(c1.getModelo());

        c1.setPonta(0.5f);
        System.out.println(c1.getPonta());

        c1.status();





    }
}