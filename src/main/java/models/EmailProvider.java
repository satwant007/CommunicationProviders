package models;

public interface EmailProvider {

    boolean authenticate(String fromEmail, String password);

    void send(String toEmail, String subject, String body);
}
