package ru.kpfu.itis.repository;

import com.datastax.driver.core.Session;

import java.util.UUID;

public class OrderRepository {

    private static final String TABLE_NAME = "books";

    private static final String TABLE_NAME_BY_TITLE = TABLE_NAME + "ByTitle";

    private Session session;

    public OrderRepository(Session session) {
        this.session = session;
    }

    /**
     * Insert a book into two identical tables using a batch query.
     *
     */
    public void insertOrderBatch() {




        String queryInsert = "insert into carsharing.order_table (id, orders) values("+(UUID.randomUUID())+", {order_date: '2018-09-09', owner: {name: 'vova', surname: 'vovanov', email: 'vovanov@gmail.com', password: 'vovan', phone: '8908', age: 10, gender: 'man', cars: [{make: 'GERMANY', model: 'BMW', number: 'o666oo', type:'dzhip', class: 'A', description: 'reliable car', price: 3000000, age: 2}]}, consumer: {name: 'vasya', surname: 'vasin', email: 'vasin@gmail.com', password: 'vasek', phone: '8908', age: 10, gender: 'man', cars: [{make: 'GERMANY', model: 'AUDI', number: 'o666oo', type:'dzhip', class: 'A', description: 'reliable car', price: 3000000, age: 2}]}, duration: 5, price: 3000, track: {time: '2018-09-10 04:05:36', latitude:123.456, longtitude:124.456}});";
        String countUpdate = "update carsharing.order_count set orders_number = orders_number+1 where id = 6ab09bec-e68e-48d9-a5f8-97e6fb4c9b47;";

        session.execute(queryInsert);
        session.execute(countUpdate);


    }

}
