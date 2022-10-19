package org.spring.project.tacocloud.data;

import org.spring.project.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    TacoOrder save(TacoOrder order);

}
