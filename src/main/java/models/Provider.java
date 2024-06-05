package models;

public abstract class Provider {
    String id;
    boolean isActive;
    boolean isAuthenticated;

    public Provider(String id) {
        this.isActive = false;
        this.isAuthenticated = false;
        this.id = id;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getId() {
        return id;
    }
}
