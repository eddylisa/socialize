package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.Location;
import com.socialSearch.socialize.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/locations/")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @PostMapping("register")
    public String recordUserLocation(@RequestBody Location location){
        locationService.createLocation(location);
        return "User location recorded successfully";
    }
}
