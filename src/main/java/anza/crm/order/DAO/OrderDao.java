/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.crm.order.DAO;

import anza.crm.order.model.Orders;



/**
 *
 * @author andrey_zatvornitskiy
 */
public interface OrderDao {
    
    public void saveOrder(Orders order);
    
}
