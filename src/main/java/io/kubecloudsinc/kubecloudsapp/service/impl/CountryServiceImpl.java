package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.model.Country;
import io.kubecloudsinc.kubecloudsapp.repository.CountryRepository;
import io.kubecloudsinc.kubecloudsapp.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountry(int countryId) {
        return countryRepository.findById(countryId).isPresent() ? countryRepository.findById(countryId).get() : new Country();
    }
}
