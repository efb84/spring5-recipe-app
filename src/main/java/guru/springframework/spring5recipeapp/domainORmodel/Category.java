package guru.springframework.spring5recipeapp.domainORmodel;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;


    @ManyToMany(mappedBy = "categories")
    private Set<Recipe>recipes;


    public Set<Recipe> getRecipesaa() {
        return recipes;
    }

    public void setRecipesaa(Set<Recipe> recipesaa) {
        this.recipes = recipes;
    }
}
