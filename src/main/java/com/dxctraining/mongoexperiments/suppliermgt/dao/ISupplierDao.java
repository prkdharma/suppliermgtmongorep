package com.dxctraining.mongoexperiments.suppliermgt.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.dxctraining.mongoexperiments.suppliermgt.entities.Supplier;

public interface ISupplierDao extends MongoRepository<Supplier, String> 
{
	
}
