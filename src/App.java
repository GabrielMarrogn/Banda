import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        List<String> list = new ArrayList<String>();
        List<Integer> listN = new ArrayList<Integer>();
        list.add("PROXYCITY");
        list.add("P.Y.N.G.");
        list.add("DNSUEY!");
        list.add("SERVERS");
        list.add("HOST!");
        list.add("CRIPTONIZE");
        list.add("OFFLINE DAY");
        list.add("SALT");
        list.add("ANSWER!");
        list.add("RAR?");
        list.add("WIFI ANTENNAS");

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = b + c;
            listN.add(d);
        }

        for (int i = 0; i < a; i++) {
            System.out.println(list.get(listN.get(i)));
        }

        sc.close();
    }
}
