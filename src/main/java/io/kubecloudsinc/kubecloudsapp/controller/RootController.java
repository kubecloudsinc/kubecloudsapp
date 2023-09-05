package io.kubecloudsinc.kubecloudsapp.controller;

import io.kubecloudsinc.kubecloudsapp.dto.*;
import io.kubecloudsinc.kubecloudsapp.service.impl.*;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class RootController {
    private final EmployeeServiceImpl employeeService;
    private final CountryServiceImpl countryService;
    private final DepartmentServiceImpl departmentService;
    private final LocationServiceImpl locationService;
    private final RegionServiceImpl regionService;

    private ModelMapper modelMapper;

    @GetMapping(path="employee",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<EmployeeDTO> getAllEmployees() {
        return Flux.fromIterable(employeeService.getAllEmployees().stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping(path="employee/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<EmployeeDTO> getEmployeeById(@PathVariable int employeeId) {
        return Mono.just(modelMapper.map(employeeService.getEmployee(employeeId), EmployeeDTO.class));
    }

    @GetMapping(path="country",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<CountryDTO> getAllCountries() {
        return Flux.fromIterable(countryService.getAllCountries().stream().map(country -> modelMapper.map(country, CountryDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping(path="country/{countryId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CountryDTO> getCountryById(@PathVariable int countryId) {
        return Mono.just(modelMapper.map(countryService.getCountry(countryId), CountryDTO.class));
    }

    @GetMapping(path="department",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<DepartmentDTO> getAllDepartments() {
        return Flux.fromIterable(departmentService.getAllDepartments().stream().map(department -> modelMapper.map(department, DepartmentDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping(path="department/{departmentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<DepartmentDTO> getDepartmentById(@PathVariable int departmentId) {
        return Mono.just(modelMapper.map(departmentService.getDepartment(departmentId), DepartmentDTO.class));
    }

    @GetMapping(path="location",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<LocationDTO> getAllLocations() {
        return Flux.fromIterable(locationService.getAllLocations().stream().map(location -> modelMapper.map(location, LocationDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping(path="location/{locationId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<LocationDTO> getLocationById(@PathVariable long locationId) {
        return Mono.just(modelMapper.map(locationService.getLocation(locationId), LocationDTO.class));
    }

    @GetMapping(path="region",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<RegionDTO> getAllRegions() {
        return Flux.fromIterable(regionService.getAllRegions().stream().map(region -> modelMapper.map(region, RegionDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping(path="region/{regionId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<RegionDTO> getRegionById(@PathVariable int regionId) {
        return Mono.just(modelMapper.map(regionService.getRegion(regionId), RegionDTO.class));
    }


}
