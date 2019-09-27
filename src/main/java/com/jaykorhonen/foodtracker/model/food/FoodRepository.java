package com.jaykorhonen.foodtracker.model.food;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

        import java.util.List;

@RepositoryRestResource(collectionResourceRel = "foods", path = "foods")
public interface FoodRepository extends MongoRepository<Food, Long> {
    List<Food> findByName(@Param("name") String name);
}