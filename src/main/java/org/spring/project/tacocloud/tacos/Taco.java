package org.spring.project.tacocloud.tacos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {
    @NotNull
    @Size(min = 1, message = "Name must be at least 1 character long")
    private String name;
    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;
    @Id
    private Long id;
    private Date createdAt = new Date();
}
