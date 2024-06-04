package com.medipro.assgn.assgn.service;

import java.util.List;

import com.medipro.assgn.assgn.beans.Product;


public interface ProductService {

	List<Product> listAllPrd();

	int addProduct(Product product);

	List<Product> ListAvaPrd();

	List<Product> delProduct(int pid);

	List<Product> editProduct(int pid, Product product);

	List<Product> toggleProduct(int pid);

	List<Product> toggleProductSecond(int pid);

	List Antibiotic();

	List INSULIN();

	List SYRUP();

}
