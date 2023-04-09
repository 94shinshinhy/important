package com.example.important.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "tb_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "discount_rate")
	private int discountRate;
	
	@Column(name = "discount_price")
	private int discountPrice;
	
	@Column(name = "product_image")
	private String productImage;
	
	@Column(name = "product_content")
	private String productContent;
	
	@Column(name = "inventory")
	private int inventory;
	
	@Column(name = "product_status")
	@ColumnDefault("0") // 0 : 판매중, 1 : 품절, 2 : 판매종료
	private int productStatus;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
}
