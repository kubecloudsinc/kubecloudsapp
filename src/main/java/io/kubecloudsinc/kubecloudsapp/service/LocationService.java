package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.model.Location;

import java.util.List;

public interface LocationService {
    List<Location> getAllLocations();

    Location getLocation(long id);
}
