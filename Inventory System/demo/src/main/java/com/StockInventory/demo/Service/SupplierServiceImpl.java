package com.StockInventory.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.StockInventory.demo.Modal.Supplier;
import com.StockInventory.demo.Modal.Telephone;
import com.StockInventory.demo.Repository.SupplierRepository;

public class SupplierServiceImpl implements SupplierService {
	@Autowired
	SupplierRepository supplierRepository;
	
@Override
public Supplier save(Supplier suppliers){
	System.out.println("dfdskfd");
	
		/*
		 * for (Telephone telephone : suppliers.getTelephones()) {
		 * telephone.setSupplier(suppliers); }
		 */
	return supplierRepository.save(suppliers);

}
}
