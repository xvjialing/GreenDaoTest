## GreenDao

- 一对多

customer

```
@Entity
public class Customer {
    @Id
    private Long id;

    @ToMany(referencedJoinProperty = "customerId")
    private List<Order> orders;
}
```

order

```
@Entity
public class Order {
    @Id
    private Long id;

    private long customerId;

    @ToOne(joinProperty = "customerId")
    private Customer customer;

}
```
