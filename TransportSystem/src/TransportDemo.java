package vu.utms;

public class TransportDemo {
    public static void main(String[] args) {
        User student = new Student("Alice", "STU001", "Computer Science");
        User lecturer = new Lecturer("Dr. James", "LEC045", "Engineering");
        User officer = new TransportOfficer("Mr. Alex", "TO012");

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();
    }
}
