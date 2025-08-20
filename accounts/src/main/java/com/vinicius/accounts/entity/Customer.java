package com.vinicius.accounts.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter
@ToString
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;

    private String mobileNumber;

}
