package com.savelife.ambulance.dto.ambulance;

import com.savelife.ambulance.entities.Phone;

import java.util.List;

public class RegistryAmbulance {

    private String licensePlate;

    private List<Phone> phone;

    public RegistryAmbulance() {
    }

    public RegistryAmbulance(String licensePlate, List<Phone> phone) {
        this.licensePlate = licensePlate;
        this.phone = phone;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
}
