package guru.springframework.spring5recipeapp.domainORmodel;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;


    @ManyToMany(mappedBy = "categoriesxx")
    private Set<Recipe>recipesaa;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipesaa() {
        return recipesaa;
    }

    public void setRecipesaa(Set<Recipe> recipesaa) {
        this.recipesaa = recipesaa;
    }
}
