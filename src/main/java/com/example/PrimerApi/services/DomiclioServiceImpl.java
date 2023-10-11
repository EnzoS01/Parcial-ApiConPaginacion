package com.example.PrimerApi.services;

import com.example.PrimerApi.entities.Domicilio;
import com.example.PrimerApi.repositories.BaseRepository;
import com.example.PrimerApi.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomiclioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomiclioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
