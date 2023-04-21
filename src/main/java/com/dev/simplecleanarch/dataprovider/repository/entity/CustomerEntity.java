package com.dev.simplecleanarch.dataprovider.repository.entity;

import com.dev.simplecleanarch.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;
}
