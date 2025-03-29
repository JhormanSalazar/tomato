package com.pizzeria_tomato.tomato.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@Getter
@Setter
@NoArgsConstructor
@IdClass(OrderItemId.class) //Para que las claves primarias compuestas funcionen, deben crearse como una clase, y meterlas aqui.
public class OrderItemEntity {
    @Id
    @Column(name = "id_order")
    private Integer idOrder;

    @Id
    @Column(name = "id_item")
    private Integer idItem;

    @Column(name = "id_pizza")
    private Integer idPizza;

    private Double quantity;

    private Double price;

    //Relaciones
    @OneToOne
    @JoinColumn(name = "id_pizza", referencedColumnName = "id_pizza", insertable = false, updatable = false)
    private PizzaEntity pizza;

    @ManyToOne
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    @JsonIgnore
    private OrderEntity order;

}
