package guru.springframework.spring5recipeapp.domainORmodel;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipefb;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipefb) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipefb = recipefb;
    }

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipefb() {
        return recipefb;
    }

    public void setRecipefb(Recipe recipefb) {
        this.recipefb = recipefb;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }

}
