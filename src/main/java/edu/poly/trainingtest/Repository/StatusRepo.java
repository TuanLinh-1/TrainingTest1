package edu.poly.trainingtest.Repository;

import edu.poly.trainingtest.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status,Long> {
}
