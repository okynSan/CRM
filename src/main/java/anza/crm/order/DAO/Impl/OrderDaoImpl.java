/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.crm.order.DAO.Impl;

import anza.crm.order.DAO.OrderDao;
import anza.crm.order.model.Orders;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;



public class OrderDaoImpl implements OrderDao {
    
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void saveOrder(Orders order) {
        sessionFactory.getCurrentSession().persist(order);
    }
    
}
