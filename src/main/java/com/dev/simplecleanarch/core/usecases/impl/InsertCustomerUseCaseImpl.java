package com.dev.simplecleanarch.core.usecases.impl;

import com.dev.simplecleanarch.core.dataprovider.FindAddressByZipCode;
import com.dev.simplecleanarch.core.dataprovider.InsertCustomer;
import com.dev.simplecleanarch.core.domain.Address;
import com.dev.simplecleanarch.core.domain.Customer;
import com.dev.simplecleanarch.core.usecases.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
