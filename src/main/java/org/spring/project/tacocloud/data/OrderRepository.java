package org.spring.project.tacocloud.data;

import org.spring.project.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, String> {
}

