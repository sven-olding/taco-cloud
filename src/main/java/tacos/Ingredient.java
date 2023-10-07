package tacos;

public record Ingredient(String id, String name, tacos.Ingredient.Type type) {
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
