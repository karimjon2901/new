import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company farhod = new Electricity("Farhod gez", 001);
        LinkedList<Client> clients = new LinkedList<Client>();
        Client a = new Client("Anvar", "Chilonzor", 65000, true, 4, 5);
        Client b = new Client("Azam", "Yunusobod", -30000, true, 2, 3);
        Client c = new Client("Komil", "Qoraqamish", -150000, false, 2, 4);
        farhod.addClient(clients,a);
        farhod.addClient(clients,b);
        farhod.addClient(clients,c);


        System.out.println(farhod.getDebtorsList(clients));
        System.out.println(farhod.getDebtorByName(clients,"Azam"));
        farhod.pay(clients,"Komil", 10000);
        System.out.println(farhod.getNonActiveClients(clients));
        System.out.println(farhod.getActiveClients(clients));

        //--------------------------------------------------------------//
//        int s = 0;
//        while (s != 11) {

//            System.out.println("1.getDebtorsList");
//            System.out.println("2.getNonActiveClients");
//            System.out.println("3.getDebtorByName");
//            System.out.println("4.getActiveClients");
//            System.out.println("5.pay");
//            Scanner sc = new Scanner(System.in);
//            sc.nextInt();
//            switch (s) {
//                case 1:
//                    System.out.println(farhod.getDebtorsList());
//                    break;
//                case 2:
//                    System.out.println(farhod.getNonActiveClients());
//                    break;
//                case 3:
//                    System.out.println(farhod.getDebtorByName("Azam"));
//                    break;
//                case 4:
//                    System.out.println(farhod.getActiveClients());
//                    break;
//                case 5:
//                    farhod.pay("Komil", 10000);
//                    break;
//            }
//        }
    }
}
