package org.spring.project.tacocloud.tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PUBLIC, force=true)
public class Ingredient  {
    @Id
    //@Column(name = "id")
    private String id;
    //@Column(name = "name")
    private String name;
    //@Column(name = "type")
    private Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE, GLUTEN
    }

}
