package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.Location;
import com.socialSearch.socialize.repositoty.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }
}
