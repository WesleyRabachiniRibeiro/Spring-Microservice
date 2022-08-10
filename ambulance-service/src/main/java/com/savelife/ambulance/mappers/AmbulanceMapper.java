package com.savelife.ambulance.mappers;

import com.savelife.ambulance.dto.ambulance.RegistryAmbulance;
import com.savelife.ambulance.dto.ambulance.SearchAmbulance;
import com.savelife.ambulance.entities.Ambulance;

public class AmbulanceMapper {

    public static Ambulance fromDTO(RegistryAmbulance ambulance){
        return new Ambulance(
                null,
                ambulance.getLicensePlate(),
                ambulance.getPhone()
        );
    }

    public static SearchAmbulance fromEntity(Ambulance ambulance){
        return new SearchAmbulance(
                ambulance.getLicensePlate(),
                PhoneMapper.fromListEntity(ambulance.getPhone())
        );
    }
    
}
