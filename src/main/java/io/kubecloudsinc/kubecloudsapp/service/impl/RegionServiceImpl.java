package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.model.Region;
import io.kubecloudsinc.kubecloudsapp.repository.RegionRepository;
import io.kubecloudsinc.kubecloudsapp.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;

    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @Override
    public Region getRegion(int regionId) {
        return regionRepository.findById(regionId).isPresent() ? regionRepository.findById(regionId).get() : new Region();
    }
}
