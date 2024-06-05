package services;

import models.Provider;
import models.EmailProvider;

import static utils.helper.SERVICE_1_ID;
import static utils.helper.generateUUID;

public class EmailProvider_service1 extends Provider implements EmailProvider {
    String fromEmail;
    public EmailProvider_service1(String fromEmail, String password) {
        super(generateUUID(SERVICE_1_ID));
        this.fromEmail = fromEmail;
        authenticate(fromEmail,password);
    }

    @Override
    public boolean authenticate(String fromEmail, String password) {
        // write logic to send and verify otp
        this.setAuthenticated(true);
        this.setActive(true);
        return true;
    }
    @Override
    public void send(String toEmail, String subject, String body) {
        if(isAuthenticated() && isActive() ){

        }
        return;
    }
}
