package net.misterhyacinth.prettierparrots.item;

import net.minecraft.item.FoodComponent;

public class PrettierParrotsFoodComponents {
    public static final FoodComponent SEED_CAKE = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent TOASTED_SEED_CAKE = new FoodComponent.Builder().hunger(2).saturationModifier(0.5F).snack().build();

}
