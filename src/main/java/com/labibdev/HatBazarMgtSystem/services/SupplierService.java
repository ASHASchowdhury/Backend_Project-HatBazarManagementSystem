package com.labibdev.HatBazarMgtSystem.services;

import com.labibdev.HatBazarMgtSystem.dtos.Response;
import com.labibdev.HatBazarMgtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
