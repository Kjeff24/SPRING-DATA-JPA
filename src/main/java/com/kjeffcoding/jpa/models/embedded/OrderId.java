package com.kjeffcoding.jpa.models.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // use instances of this class as a composite primary key in Order entity class
public class OrderId  implements Serializable {
    private String username;
    private LocalDateTime orderDate;
}
