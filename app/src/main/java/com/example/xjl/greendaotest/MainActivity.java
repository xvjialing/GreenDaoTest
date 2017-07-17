package com.example.xjl.greendaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xjl.greendaotest.gen.CustomerDao;
import com.example.xjl.greendaotest.gen.DaoSession;
import com.example.xjl.greendaotest.gen.OrderDao;

import org.greenrobot.greendao.query.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DaoSession daoSession;
    private CustomerDao customerDao;
    private OrderDao orderDao;

    private Query<Customer> customerQuery;
    private Query<Order> orderQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daoSession=((App)getApplication()).getDaoSession();
        customerDao = daoSession.getCustomerDao();
        orderDao = daoSession.getOrderDao();



        Customer customer=new Customer(null);
        customerDao.insert(customer);

        List<Order> orders=new ArrayList<>();
        Order order=new Order(null,1);
        Order order1=new Order(null,1);
        Order order2=new Order(null,1);
        orderDao.insert(order);
        orderDao.insert(order1);
        orderDao.insert(order2);

        order.setCustomer(customer);
        order1.setCustomer(customer);
        order2.setCustomer(customer);

//        List<Order> orders2=customer.getOrders();
        List<Order> orders3=orderDao.queryBuilder().build().list();
        List<Customer> listCustomer=customerDao.queryBuilder().build().list();

        Log.d("customersize",String.valueOf(listCustomer.size()));
        Log.d("order3size",String.valueOf(orders3.size()));

//        Log.d("order2size",String.valueOf(orders2.size()));
//        for (Order ordeerBean:orders2) {
//            Log.d("orderid",ordeerBean.getId()+""+ordeerBean.getCustomerId());
//        }
        for (Customer customBean:listCustomer) {
            List<Order> orders4=customBean.getOrders();
            Log.d("order4Size",String.valueOf(orders4.size()));
            for (Order orderBean:orders4) {
                Log.d("orderValue",orderBean.getId()+"--"+orderBean.getCustomerId());
            }

        }

//        customerDao.deleteAll();
//        orderDao.deleteAll();
        
    }
}
