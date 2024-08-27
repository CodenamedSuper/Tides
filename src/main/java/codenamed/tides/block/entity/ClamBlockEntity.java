package codenamed.tides.block.entity;

import codenamed.tides.registry.TidesBlockEntityType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class ClamBlockEntity extends BlockEntity {
    public Boolean pearled = false;
    public ClamBlockEntity(BlockPos pos, BlockState state) {
        super(TidesBlockEntityType.CLAM, pos, state);

        Random random = new Random();

        if (random.nextInt(1, 11) == 5) {
            pearled = true;
        }
    }


    public  Boolean getPearled() {
        return  pearled;
    }




}
