package com.yan.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    //商品数量
    private Integer productQuantity;
    private String productIcon;
}