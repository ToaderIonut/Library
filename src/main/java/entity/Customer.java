package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "funds", nullable = false)
    private int funds;

    @Column(name = "age", nullable = false)
    private int age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", orphanRemoval = true)
    private List<Order> orderList = new ArrayList<>();
}
