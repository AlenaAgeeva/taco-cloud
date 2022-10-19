package org.spring.project.tacocloud.data;

import org.spring.project.tacocloud.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
