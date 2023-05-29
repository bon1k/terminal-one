package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Port;
import com.airportservice.terminalone.repository.IBaseRepository;
import com.airportservice.terminalone.repository.IPortRepository;
import org.springframework.stereotype.Service;

@Service
public class PortService extends CrudService<Port> implements IPortService {

    IPortRepository portRepository;

    public PortService(IPortRepository portRepository) {
        this.portRepository = portRepository;
    }

    @Override
    public IBaseRepository<Port> getRepository() {
        return portRepository;
    }
}
