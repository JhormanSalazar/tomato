package com.pizzeria_tomato.tomato.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "id_customer")
    private String idCustomer;

    private String name;

    private String address;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
}
