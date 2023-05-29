package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Plane;

public interface IPlaneService extends ICrudService<Plane>{

    public Plane changePortParking(Long portId);
}
