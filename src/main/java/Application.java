import models.Provider;
import services.EmailProvider_service1;
import services.SmsProvider_service1;

import java.util.HashMap;

public class Application {
    HashMap<String, Provider> providers = new HashMap<>();
    public static void main(String[] args) {

    }

    public Provider createSmsProvider_service1(String phoneNumber){
        return new SmsProvider_service1(phoneNumber);
    }
    public Provider createEmailProvider_service1(String email, String password){
        return new EmailProvider_service1(email,password);
    }

    public void printAllProviderIds(){
        providers.keySet().forEach(id -> System.out.println(id));
    }

/**_________________________________________________**/


    public void addProvider(Provider provider){
        System.out.println("Provider Added with ID : "+provider.getId());
        providers.put(provider.getId(), provider);
    }

    public Provider getProvider(String providerId){
        return providers.get(providerId);
    }

    public boolean updateState(String id, boolean active){
        providers.get(id).setActive(active);
        return true;    // signifies update success
    }

    public String updateProvider(Provider provider){
        // would instead delete the existing provider and
        // return the new provider.
        // Would need to run the Auth methods again
        // and return the new id.
        return "id";
    }


}
