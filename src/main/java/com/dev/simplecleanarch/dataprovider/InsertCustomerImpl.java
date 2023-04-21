package com.dev.simplecleanarch.dataprovider;

import com.dev.simplecleanarch.core.dataprovider.InsertCustomer;
import com.dev.simplecleanarch.core.domain.Customer;
import com.dev.simplecleanarch.dataprovider.repository.CustomerRepository;
import com.dev.simplecleanarch.dataprovider.repository.entity.CustomerEntity;
import com.dev.simplecleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;
    @Override
    @Transactional
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
