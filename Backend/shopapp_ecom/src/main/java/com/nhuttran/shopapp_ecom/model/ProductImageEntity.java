package com.nhuttran.shopapp_ecom.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductImageEntity {
    public static final int MAXIMUM_IMAGES_PER_PRODUCT = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "image_url", length = 300)
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}
