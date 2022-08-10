package com.savelife.ambulance.services;

import com.savelife.ambulance.entities.Ambulance;
import com.savelife.ambulance.repositories.AmbulanceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class AmbulanceService {

    private final AmbulanceRepository repository;
    
    private  AmbulanceService(AmbulanceRepository repository){
        this.repository = repository;
    }

    public Ambulance saveAmbulance(Ambulance user){
        return repository.save(user);
    }

    public Ambulance findAmbulance(Long id){
        Optional<Ambulance> user = repository.findById(id);
        return user.orElseThrow(() -> new EntityNotFoundException("Ambulance Not Found!"));
    }

    public Page<Ambulance> listAllAmbulances(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Ambulance updateAmbulance(Ambulance updatedAmbulance, Long id){
        Ambulance ambulance = this.findAmbulance(id);
        updatedAmbulance.setId(ambulance.getId());
        return repository.save(updatedAmbulance);
    }

    public void deleteAmbulance(Long id){
        Ambulance ambulance = this.findAmbulance(id);
        repository.delete(ambulance);
    }
}
