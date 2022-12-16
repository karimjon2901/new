import java.awt.*;
import java.util.LinkedList;

public class Electricity extends Company{
    public int measurement = 300;
    public int limitDebtAmount = 100000;
    public int countClients = 0;


    public Electricity(String name, int code){
        this.name = name;
        this.code = code;
        LinkedList<Client> clients = new LinkedList<Client>();
    }
    public Electricity(String name, int code, int measurement){
        this.name = name;
        this.code = code;
        this.measurement = measurement;
        LinkedList<Client> clients = new LinkedList<Client>();
    }

    @Override
    public void addClient(LinkedList<Client> clients,Client client) {
        clients.add(client);
    }


    @Override
    public void calculateByMeasurement(LinkedList<Client> clients, String name, int money) {
        for (Client client : clients) {
            if (client.getName().equals(name)){
                client.deposit/=measurement;
            }
        }
    }

    @Override
    public LinkedList<Client> getDebtorsList(LinkedList<Client> clients) {
        LinkedList<Client> l = new LinkedList<Client>();
        for (Client client : clients) {
            if (client.deposit<0) l.add(client);
        }
        return l;
    }
}
