package co.com.sofka.model;

public class ZonaFitCoModel {

    private String nameClient;
    private String emailClient;
    private String lastNameClient;
    private String addressClient;
    private String phoneClient;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public State getStateClient() {
        return stateClient;
    }

    public void setStateClient(State stateClient) {
        this.stateClient = stateClient;
    }

    public City getCityClient() {
        return cityClient;
    }

    public void setCityClient(City cityClient) {
        this.cityClient = cityClient;
    }

    public String getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }
}


