package com.savelife.ambulance.dto.ambulance;

import com.savelife.ambulance.dto.phone.SearchPhone;

import java.util.List;

public class SearchAmbulance {

    private String licensePlate;

    private List<SearchPhone> phone;

    public SearchAmbulance() {
    }

    public SearchAmbulance(String licensePlate, List<SearchPhone> phone) {
        this.licensePlate = licensePlate;
        this.phone = phone;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<SearchPhone> getPhone() {
        return phone;
    }

    public void setPhone(List<SearchPhone> phone) {
        this.phone = phone;
    }
}
