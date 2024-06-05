package services;

import models.Provider;
import models.SMSProvider;

import static utils.helper.SERVICE_1_ID;
import static utils.helper.generateUUID;

public class SmsProvider_service1 extends Provider implements SMSProvider {

    String phoneNumber;
    public SmsProvider_service1(String phoneNumber) {
        super(generateUUID(SERVICE_1_ID));
        this.phoneNumber = phoneNumber;
        authenticate(phoneNumber);
    }

    @Override
    public boolean authenticate(String phoneNumber) {
        // write logic to send and verify otp
        this.setAuthenticated(true);
        this.setActive(true);
        return true;
    }

    @Override
    public void send(String phoneNumber, String message) {
        if(isAuthenticated() && isActive() ){
            // send Sms
        }
        return;
    }
}
