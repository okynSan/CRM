/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import anza.crm.order.DAO.OrderDao;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import anza.crm.order.model.Orders;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
/**
 *
 * @author andrey_zatvornitskiy
 */
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class OrderTest  {
    
    @Autowired
    OrderDao orderDao;
   

    @Test
    public void saveOrder(){
        
     Orders order = new Orders();   
     order.setOrderName("test of order");
     
     
     orderDao.saveOrder(order);
        
    }
    
}
