package org.spring.project.tacocloud.data;

import org.spring.project.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
