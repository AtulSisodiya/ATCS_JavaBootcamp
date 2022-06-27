package com.project.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entity.ProductEntity;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, Long> {
	@Query("SELECT n FROM ProductEntity n WHERE n.productId=:i")
	ProductEntity detail(@Param("i") Long i);

	@Query("SELECT n FROM ProductEntity n WHERE n.active=:active and n.isApproved=:isApproved")
	List<ProductEntity> showProduct(@Param("active") String active, @Param("isApproved") String isApproved);

	@Query("SELECT n FROM ProductEntity n WHERE n.active=:active and n.isApproved=:isApproved and n.category=:category")
	List<ProductEntity> showCategoryProduct(@Param("active") String active, @Param("isApproved") String isApproved,
			@Param("category") String category);

	@Query("SELECT n FROM ProductEntity n WHERE n.active=:active and n.isApproved=:isApproved and n.productName=:productName")
	List<ProductEntity> findByProductName(@Param("active") String active, @Param("isApproved") String isApproved,
			@Param("productName") String productName);

	List<ProductEntity> findByProductName(String productName);

	List<ProductEntity> findBycategory(String category);
}
