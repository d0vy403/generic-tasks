package Generic3;

public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();

        DnsServer googleServer = new DnsServer(8, 8);
        DnsServer amazonServer = new DnsServer(4, 4);
        DnsServer azureServer = new DnsServer(1, 1);

        dnsMap.ideti(new Pora<>(DnsProvider.GOOGLE, googleServer));
        dnsMap.ideti(new Pora<>(DnsProvider.AMAZON, amazonServer));
        dnsMap.ideti(new Pora<>(DnsProvider.AZURE, azureServer));

        for (DnsProvider provider : DnsProvider.values()) {
            try {
                DnsServer server = dnsMap.gauti(provider);
                System.out.println(provider + " Server IP1: " + server.getIp1() + ", IP2: " + server.getIp2());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

