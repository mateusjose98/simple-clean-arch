package com.dev.simplecleanarch.dataprovider.client.mapper;

import com.dev.simplecleanarch.core.domain.Address;
import com.dev.simplecleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
