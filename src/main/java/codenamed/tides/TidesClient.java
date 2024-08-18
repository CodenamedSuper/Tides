package codenamed.tides;

import codenamed.tides.registry.TidesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TidesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.URCHIN_SPINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.ANEMONE_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TidesBlocks.SPONGE_TUBES, RenderLayer.getCutout());

    }
}
