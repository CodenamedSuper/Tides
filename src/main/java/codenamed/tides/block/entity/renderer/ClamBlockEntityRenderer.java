package codenamed.tides.block.entity.renderer;
import codenamed.tides.block.custom.ClamBlock;
import codenamed.tides.block.entity.ClamBlockEntity;
import codenamed.tides.registry.TidesItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Objects;

public class ClamBlockEntityRenderer implements BlockEntityRenderer<ClamBlockEntity> {
    public ClamBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }


    @Override
    public void render(ClamBlockEntity entity, float tickDelta,
                       MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

        Boolean pearled = entity.getPearled();

        if (pearled) {

            ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
            ItemStack stack = TidesItems.PEARL.getDefaultStack();
            matrices.push();
            matrices.translate(0.5f, 0.3, 0.5f);
            matrices.scale(1f, 0.7f, 1f);
            

            if (stack.isEmpty()) {
                stack = Items.AIR.getDefaultStack();
            }

            itemRenderer.renderItem(stack, ModelTransformationMode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                    OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);


            matrices.pop();
        }

    }


    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}
