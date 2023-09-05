package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.model.Location;
import io.kubecloudsinc.kubecloudsapp.repository.LocationRepository;
import io.kubecloudsinc.kubecloudsapp.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;
    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocation(long locationId) {
        return locationRepository.findById(locationId).isPresent() ? locationRepository.findById(locationId).get() : new Location();
    }
}
