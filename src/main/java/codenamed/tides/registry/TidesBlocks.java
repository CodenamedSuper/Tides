package codenamed.tides.registry;
import codenamed.tides.Tides;
import codenamed.tides.block.MarinalBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class TidesBlocks {

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool()));

    public static final Block BARNACLE_LIMESTONE = registerBlock("barnacle_limestone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool()));

    public static final Block URCHIN = registerBlock("urchin",
            new Block(AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK).requiresTool()));

    public static final Block URCHIN_SPINES = registerBlock("urchin_spines",
            new MarinalBlock(7.0F, 3.0F, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL).requiresTool()));

    public static final Block ANEMONE = registerBlock("anemone",
            new Block(AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK).requiresTool()));

    public static final Block ANEMONE_TENTACLES = registerBlock("anemone_tentacles",
            new MarinalBlock(7.0F, 3.0F, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL).requiresTool()));

    public static final Block SPONGE_TUBES = registerBlock("sponge_tubes",
            new MarinalBlock(7.0F, 3.0F, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL).requiresTool()));

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
