package com.kjeffcoding.jpa.models.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_order")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;
    private String orderInfo;

}
