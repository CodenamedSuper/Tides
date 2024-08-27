package codenamed.tides;

import codenamed.tides.block.entity.renderer.ClamBlockEntityRenderer;
import codenamed.tides.registry.TidesBlockEntityType;
import codenamed.tides.registry.TidesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class TidesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.URCHIN_SPINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.ANEMONE_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.SPONGE_TUBES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.PLATED_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.LEAF_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.GHOST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_PLATED_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_LEAF_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_GHOST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.PLATED_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.LEAF_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.GHOST_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_PLATED_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_LEAF_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_GHOST_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.PLATED_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.LEAF_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.GHOST_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_PLATED_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_LEAF_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.DEAD_GHOST_CORAL_WALL_FAN, RenderLayer.getCutout());


        BlockEntityRendererFactories.register(TidesBlockEntityType.CLAM, ClamBlockEntityRenderer::new);
    }
}
