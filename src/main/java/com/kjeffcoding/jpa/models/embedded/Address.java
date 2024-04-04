package com.kjeffcoding.jpa.models.embedded;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // use instances of this class as an attribute in Order entity class
public class Address {
    private String streetName;
    private String houseNumber;
    private String zipCode;
}
