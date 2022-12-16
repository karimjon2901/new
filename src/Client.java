public class Client {
    String name;
    String address;
    int deposit;
    Boolean isActive;
    int startedDate;
    int lastPaidDate;

    Client (String name, String address, int deposit, Boolean isActive, int startedDate, int lastPaidDate){
        this.name = name;
        this.address = address;
        this.deposit = deposit;
        this.isActive = isActive;
        this.startedDate = startedDate;
        this.lastPaidDate = lastPaidDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public int getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(int startedDate) {
        this.startedDate = startedDate;
    }

    public int getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(int lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", deposit=" + deposit +
                ", isActive=" + isActive +
                ", startedDate=" + startedDate +
                ", lastPaidDate=" + lastPaidDate +
                '}';
    }
}
