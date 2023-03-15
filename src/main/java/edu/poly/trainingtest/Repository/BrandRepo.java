package edu.poly.trainingtest.Repository;

import edu.poly.trainingtest.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand,Long> {
}
