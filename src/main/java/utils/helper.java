package utils;

import java.util.Random;

public class helper {
    public static String generateUUID(String serviceName){
        String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
        int LENGTH = 5;
        Random RANDOM = new Random();
        StringBuilder uuid = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            uuid.append(CHARACTERS.charAt(index));
        }
        return serviceName+"_"+uuid.toString();
    }

    public static String SERVICE_1_ID = "service1";
}
