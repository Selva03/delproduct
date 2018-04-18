package com.product.deleteproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.deleteproduct.model.Deleteproduct;


public interface DeleteproductRepository extends JpaRepository<Deleteproduct, Long> {

}
