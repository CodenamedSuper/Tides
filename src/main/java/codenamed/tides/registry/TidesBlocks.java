package codenamed.tides.registry;
import codenamed.tides.Tides;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
public class TidesBlocks {

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool()));

    public static final Block BARNACLE_LIMESTONE = registerBlock("barnacle_limestone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool()));

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(Tides.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        return item;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Tides.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {

        return Registry.register(Registries.BLOCK, Identifier.of(Tides.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Tides.LOGGER.info("Registering Blocks for " + Tides.MOD_ID);
    }
}
