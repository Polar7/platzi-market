package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private CompraRepository compraRepository;

    public PurchaseService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public List<Purchase> getAll() {
        return compraRepository.getAll();
    }

    public Optional<List<Purchase>> getByCliente(String clientId) {
        return compraRepository.getByCliente(clientId);
    }

    public Purchase save(Purchase purchase) {
        return compraRepository.save(purchase);
    }

}
