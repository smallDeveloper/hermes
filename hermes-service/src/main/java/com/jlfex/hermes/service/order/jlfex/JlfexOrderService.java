package com.jlfex.hermes.service.order.jlfex;

import com.jlfex.hermes.model.yltx.JlfexOrder;

/**
 * JLFEX 订单 业务
 * @author Administrator
 *
 */
public interface JlfexOrderService {
	
	public JlfexOrder  saveOrder(JlfexOrder jlfexOrder) throws Exception  ;

}
