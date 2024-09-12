package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.model.Region;

import java.util.List;

public interface RegionService {
    List<Region> getAllRegions();

    Region getRegion(int id);
}
