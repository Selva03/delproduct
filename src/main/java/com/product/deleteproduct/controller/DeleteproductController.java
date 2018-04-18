package com.product.deleteproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.deleteproduct.model.Deleteproduct;
import com.product.deleteproduct.repository.DeleteproductRepository;



@RestController
@RequestMapping("/apz")
public class DeleteproductController {

	 @Autowired
	 DeleteproductRepository deleteproductRepository;
	 
	 
	  @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Deleteproduct> deleteProduct(@PathVariable(value = "id") Long productId) {
	    	Deleteproduct deleteproduct = deleteproductRepository.findOne(productId);
	        if(deleteproduct == null) {
	            return ResponseEntity.notFound().build();
	        }

	        deleteproductRepository.delete(deleteproduct);
	        return ResponseEntity.ok().build();
	    }

}

