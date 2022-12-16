import java.awt.*;
import java.util.LinkedList;

public abstract class Company {
    public String name;
    public int code;
    public String clients;
    public int currentDate;


    public abstract void addClient(LinkedList<Client> clients, Client client);
    public abstract void calculateByMeasurement(LinkedList<Client> clients, String name, int money);
    public abstract LinkedList<Client> getDebtorsList(LinkedList<Client> clients);

    public String getDebtorByName(LinkedList<Client> clients, String name) {
        for (Client client : clients) {
            if (client.getName().equals(name)){
                return client.toString();
            }
        }
        return "Bunday foydalanuvchi mavjud emas!";
    }

    public void pay(LinkedList<Client> clients, String name, int money) {
        for (Client client : clients) {
            if (client.getName().equals(name)){
                client.deposit+=money;
                sendNotificationForDebtor(client.deposit);
            }

        }
    }

    public void sendNotificationForDebtor(int deposit){
        System.out.println("Hisobingiz: "+deposit);
    }

    public LinkedList<Client> getNonActiveClients(LinkedList<Client> clients) {
        LinkedList<Client> l = new LinkedList<Client>();
        for (Client client : clients) {
            if (!client.getIsActive()) l.add(client);
        }
        return l;
    }

    public LinkedList<Client> getActiveClients(LinkedList<Client> clients) {
        LinkedList<Client> l = new LinkedList<Client>();
        for (Client client : clients) {
            if (client.getIsActive()) l.add(client);
        }
        return l;
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", clients='" + clients + '\'' +
                ", currentDate=" + currentDate +
                '}';
    }
}
