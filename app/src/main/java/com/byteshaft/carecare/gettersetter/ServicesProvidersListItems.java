package com.byteshaft.carecare.gettersetter;

public class ServicesProvidersListItems {

    private String serviceProviderName;
    private String serviceProviderImage;
    private int serviceProviderId;
    private String providersContactNumber;
    private String servicePrice;

    public String getServicePrice() {
        return servicePrice;

    }
    public void setServicePrice(String servicePrivce) {
        this.servicePrice = servicePrivce;
    }


    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getServiceProviderImage() {
        return serviceProviderImage;
    }

    public void setServiceProviderImage(String serviceProviderImage) {
        this.serviceProviderImage = serviceProviderImage;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }



    public String getProvidersContactNumber() {
        return providersContactNumber;
    }

    public void setProvidersContactNumber(String providersContactNumber) {
        this.providersContactNumber = providersContactNumber;
    }

}
