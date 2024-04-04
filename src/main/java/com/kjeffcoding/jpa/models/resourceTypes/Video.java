package com.kjeffcoding.jpa.models.resourceTypes;

import com.kjeffcoding.jpa.models.Resource;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
//@PrimaryKeyJoinColumn(name = "video_id")
//@DiscriminatorValue("V") --> only with SINGLE_TABLE
public class Video extends  Resource {
    private int length;
}
