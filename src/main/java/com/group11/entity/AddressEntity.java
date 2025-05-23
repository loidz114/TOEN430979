package com.group11.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressID;

    @Column(columnDefinition = "nvarchar(250)")
    private String country;

    @Column(columnDefinition = "nvarchar(250)")
    private String province;

    @Column(columnDefinition = "nvarchar(250)")
    private String district;

    @Column(columnDefinition = "nvarchar(250)")
    private String commune;

    @Column(columnDefinition = "nvarchar(250)")
    private String other;
}
