package com.dev.simplecleanarch.dataprovider.repository.mapper;

import com.dev.simplecleanarch.core.domain.Customer;
import com.dev.simplecleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
