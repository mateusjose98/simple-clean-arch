package com.dev.simplecleanarch.dataprovider;

import com.dev.simplecleanarch.core.dataprovider.FindAddressByZipCode;
import com.dev.simplecleanarch.core.domain.Address;
import com.dev.simplecleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.dev.simplecleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.dev.simplecleanarch.dataprovider.client.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;
    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
