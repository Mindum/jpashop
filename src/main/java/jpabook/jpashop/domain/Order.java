package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private  Long id;


    @ManyToOne
    @JoinColumn(name = "member_id")
    private  Member member;

    private  List<OrderItem> orderItems = new ArrayList<>();

    private Delivery delivery;

    private  LocalDateTime orderDate; // 주문시간

    private  OrderStatus status; // 주문상태 order, cancel


}
