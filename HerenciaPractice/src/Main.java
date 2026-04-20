import java.sql.Timestamp;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Commons> list = new ArrayList<>();
        Timestamp hora = new Timestamp(System.currentTimeMillis());
        list.add(new Product(1L, hora, hora, "Cellphone", 2300.00));

        for (Commons c : list){
            System.out.println(c.getId());
            System.out.println(c.getCreatedAt());
        }

    }
}