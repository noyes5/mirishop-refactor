package com.mirishop.orderpayment.order.dto;

import com.mirishop.orderpayment.order.domain.OrderStatus;
import com.mirishop.orderpayment.order.enttiy.Order;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;

@Getter
public class OrderDto {

    private Long orderId;
    private Long memberNumber;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private List<OrderItemDto> orderItems;

    public OrderDto(Order order) {
        this.orderId = order.getOrderId();
        this.memberNumber = order.getMemberNumber();
        this.orderDate = order.getOrderDate();
        this.status = order.getStatus();
        this.orderItems = order.getOrderItems().stream()
                .map(OrderItemDto::new)
                .toList();
    }
}
