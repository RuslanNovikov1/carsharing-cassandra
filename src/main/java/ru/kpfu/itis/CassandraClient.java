package ru.kpfu.itis;

import com.datastax.driver.core.Session;
import ru.kpfu.itis.repository.KeyspaceRepository;
import ru.kpfu.itis.repository.OrderRepository;

public class CassandraClient {


    public static void main(String args[]) {
        CassandraConnector connector = new CassandraConnector();
        connector.connect("127.0.0.1", 9042);
        Session session = connector.getSession();

        KeyspaceRepository sr = new KeyspaceRepository(session);

        sr.createKeyspace("carsharing", "SimpleStrategy", 1);
        sr.useKeyspace("carsharing");

        OrderRepository br = new OrderRepository(session);

          br.insertOrderBatch();

        connector.close();
    }
}