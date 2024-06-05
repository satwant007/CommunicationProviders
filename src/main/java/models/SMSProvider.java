package models;

public interface SMSProvider {
    boolean authenticate(String phoneNumber);

    void send(String phoneNumber, String message);
}
