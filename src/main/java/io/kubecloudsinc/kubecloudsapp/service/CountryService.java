package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();

    Country getCountry(int id);
}
