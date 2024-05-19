package com.sham.Practice.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Emp")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
