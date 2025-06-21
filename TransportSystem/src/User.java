package vu.utms;

public class User {
    protected String name;
    protected String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public void requestTransport() {
        System.out.println("User " + name + " is requesting transport.");
    }
}
