package Generic3;

public class DnsServer {
    private int ip1;
    private int ip2;

    public DnsServer(int ip1, int ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    public int getIp1() {
        return ip1;
    }

    public void setIp1(int ip1) {
        this.ip1 = ip1;
    }

    public int getIp2() {
        return ip2;
    }

    public void setIp2(int ip2) {
        this.ip2 = ip2;
    }
}
