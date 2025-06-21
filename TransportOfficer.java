package vu.utms;

public class TransportOfficer extends User {

    public TransportOfficer(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + name + " is scheduling transport for other users.");
    }
}
