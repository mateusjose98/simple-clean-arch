package com.dev.simplecleanarch.core.usecases;

import com.dev.simplecleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
