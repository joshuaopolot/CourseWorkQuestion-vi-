package vu.utms;

public class Lecturer extends User {
    private String department;

    public Lecturer(String name, String userId, String department) {
        super(name, userId);
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + name + " requests transport for a departmental field visit.");
    }
}
