package com.example.xjl.greendaotest.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.xjl.greendaotest.Customer;
import com.example.xjl.greendaotest.Order;

import com.example.xjl.greendaotest.gen.CustomerDao;
import com.example.xjl.greendaotest.gen.OrderDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig customerDaoConfig;
    private final DaoConfig orderDaoConfig;

    private final CustomerDao customerDao;
    private final OrderDao orderDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        customerDaoConfig = daoConfigMap.get(CustomerDao.class).clone();
        customerDaoConfig.initIdentityScope(type);

        orderDaoConfig = daoConfigMap.get(OrderDao.class).clone();
        orderDaoConfig.initIdentityScope(type);

        customerDao = new CustomerDao(customerDaoConfig, this);
        orderDao = new OrderDao(orderDaoConfig, this);

        registerDao(Customer.class, customerDao);
        registerDao(Order.class, orderDao);
    }
    
    public void clear() {
        customerDaoConfig.clearIdentityScope();
        orderDaoConfig.clearIdentityScope();
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

}
