package com.sdsmeta.demo.services;

import com.sdsmeta.demo.entities.Sale;
import com.sdsmeta.demo.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}
