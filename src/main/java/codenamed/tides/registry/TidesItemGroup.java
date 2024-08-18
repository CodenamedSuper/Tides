package codenamed.tides.registry;
import codenamed.tides.Tides;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TidesItemGroup {
    public static ItemGroup CAVENS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Tides.MOD_ID, "tides"),
            FabricItemGroup.builder().displayName(Text.translatable("Cavens"))
                    .icon(() -> new ItemStack(TidesBlocks.LIMESTONE)).entries((displayContext, entries) -> {

                        entries.add(TidesBlocks.LIMESTONE);
                        entries.add(TidesBlocks.BARNACLE_LIMESTONE);


                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
