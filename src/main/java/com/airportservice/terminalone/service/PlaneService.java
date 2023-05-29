package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Plane;
import com.airportservice.terminalone.repository.IBaseRepository;
import com.airportservice.terminalone.repository.IPlaneRepository;
import org.springframework.stereotype.Service;


@Service
public class PlaneService extends CrudService<Plane> implements IPlaneService{
    IPlaneRepository planeRepository;

    public PlaneService(IPlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Override
    public IBaseRepository<Plane> getRepository() {
        return planeRepository;
    }

    @Override
    public Plane changePortParking(Long portId) {
        //при вызове метода должен создаться Route для перегона самолёта в новый порт.
        return null;
    }
}

