package net.sba.doors.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.sba.doors.DoorsEntities;
import net.minecraft.registry.Registry;
import net.minecraft.item.Item;

public class ModItems {
    public static final Item LIGHTER = registerItem("lighter", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DoorsEntities.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DoorsEntities.LOGGER.info("Registering Mod Item for " + DoorsEntities.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LIGHTER);
        });
    }
}
