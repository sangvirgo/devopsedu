package com.ecommerce.DTO;

import com.ecommerce.model.OrderItem;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class OrderItemDTO {
    private Long id;
    private Long productId;
    private String productTitle;
    private String imageUrl;
    private int quantity;
    private String size;
    private int price;
    private Integer discountedPrice;
    private Integer discountPercent;
    private LocalDateTime deliveryDate;

    public OrderItemDTO(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.productId = orderItem.getProduct().getId();
        this.productTitle = orderItem.getProduct().getTitle();
        this.imageUrl = orderItem.getProduct().getImageUrl();
        this.quantity = orderItem.getQuantity();
        this.size = orderItem.getSize();
        this.price = orderItem.getPrice();
        this.discountedPrice = orderItem.getDiscountedPrice();
        this.discountPercent= orderItem.getProduct().getDiscountPersent();
        this.deliveryDate = orderItem.getDeliveryDate();
    }
} 