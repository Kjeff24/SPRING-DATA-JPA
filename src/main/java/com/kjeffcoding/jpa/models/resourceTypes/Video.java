package com.kjeffcoding.jpa.models.resourceTypes;

import com.kjeffcoding.jpa.models.Resource;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("V")
public class Video extends Resource {
    private int length;
}
