package net.misterhyacinth.prettierparrots.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.misterhyacinth.prettierparrots.PrettierParrotsMod;

public class PrettierParrotsItems {


    public static final Item SEED_CAKE = registerItem("seed_cake",
            new Item(new FabricItemSettings().group(PrettierParrotsItemGroup.PRETTIERPARROTS).food(PrettierParrotsFoodComponents.SEED_CAKE)));
    public static final Item TOASTED_SEED_CAKE = registerItem("toasted_seed_cake",
            new Item(new FabricItemSettings().group(PrettierParrotsItemGroup.PRETTIERPARROTS).food(PrettierParrotsFoodComponents.TOASTED_SEED_CAKE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PrettierParrotsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PrettierParrotsMod.LOGGER.debug("Registering Mod Items for " + PrettierParrotsMod.MOD_ID);
    }
}
