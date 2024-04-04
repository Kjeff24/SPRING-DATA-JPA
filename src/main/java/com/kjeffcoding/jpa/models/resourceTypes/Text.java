package com.kjeffcoding.jpa.models.resourceTypes;

import com.kjeffcoding.jpa.models.Resource;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("T")
public class Text extends Resource {
    private String content;
}
