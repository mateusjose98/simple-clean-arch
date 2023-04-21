package com.dev.simplecleanarch.core.dataprovider;

import com.dev.simplecleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
