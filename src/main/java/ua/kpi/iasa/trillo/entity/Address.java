package ua.kpi.iasa.trillo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    private Long id;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

}
