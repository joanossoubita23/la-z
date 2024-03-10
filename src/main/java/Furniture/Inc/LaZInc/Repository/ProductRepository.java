package Furniture.Inc.LaZInc.Repository;

import Furniture.Inc.LaZInc.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
