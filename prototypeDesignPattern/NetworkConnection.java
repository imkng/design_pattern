package prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public void loadVeryImportantData(){
        this.importantData = "Very very important Data";
        this.domains.add("Hello.com");
        this.domains.add("Hi.com");
        this.domains.add("Bye.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        NetworkConnection clone = new NetworkConnection();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        clone.setIp(this.ip);
        clone.setImportantData(this.importantData);
        for (String str: this.getDomains()) {
            clone.getDomains().add(str);
        }

        return clone;
    }
}
