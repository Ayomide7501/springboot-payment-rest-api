package com.transaction.springboot.dto;

import com.transaction.springboot.model.Order;
import com.transaction.springboot.model.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
