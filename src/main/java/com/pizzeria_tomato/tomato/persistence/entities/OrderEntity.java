package com.pizzeria_tomato.tomato.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.query.Order;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pizza_order")
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_customer")
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime date;

    private Integer total;

    @Column(columnDefinition = "CHAR(1)")
    private String method;

    @Column(name = "additional_notes")
    private String additionalNotes;

    @OneToOne(fetch = FetchType.LAZY) // Indica que no cargara la informacion hasta que se use
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    @JsonIgnore
    private CustomerEntity customer;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER) // EAGER: Siempre que llamemos a un OrderEntity, se llamara
    // esta relacion, es decir, se cargaran los datos en esta lista
    private List<OrderItemEntity> items;
}
