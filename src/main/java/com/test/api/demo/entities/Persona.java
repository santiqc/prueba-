package com.test.api.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "tbl_personas")
@Data
public class Persona {

    @Id
    private Long id;
    private String nombre;
    private Integer edad;

}
