package net.misterhyacinth.prettierparrots.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.misterhyacinth.prettierparrots.PrettierParrotsMod;

public class PrettierParrotsItemGroup {
    public static final ItemGroup PRETTIERPARROTS = FabricItemGroupBuilder.build(
            new Identifier(PrettierParrotsMod.MOD_ID, "prettierparrots"), () -> new ItemStack(PrettierParrotsItems.TOASTED_SEED_CAKE));

}
