package com.StockInventory.demo.Repository;

//import java.util.function.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockInventory.demo.Modal.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
