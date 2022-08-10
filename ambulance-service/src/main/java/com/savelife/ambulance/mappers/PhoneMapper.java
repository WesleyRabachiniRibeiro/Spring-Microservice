package com.savelife.ambulance.mappers;

import com.savelife.ambulance.dto.phone.SearchPhone;
import com.savelife.ambulance.entities.Phone;
import java.util.ArrayList;
import java.util.List;

public class PhoneMapper {

    public static SearchPhone fromEntity(Phone phone){
        return new SearchPhone(phone.getNumber());
    }

    public static List<SearchPhone> fromListEntity(List<Phone> phones){
        List<SearchPhone> searchPhones = new ArrayList<SearchPhone>();
        phones.forEach(phone -> {
            searchPhones.add(new SearchPhone(phone.getNumber()));
        });
        return searchPhones;
    }
}
