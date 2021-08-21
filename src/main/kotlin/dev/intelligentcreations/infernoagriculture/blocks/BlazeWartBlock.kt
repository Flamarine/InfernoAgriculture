package dev.intelligentcreations.infernoagriculture.blocks

import net.minecraft.block.Fertilizable
import net.minecraft.block.PlantBlock


class BlazeWartBlock(settings: Settings?) : PlantBlock(settings) {

    override fun BlazeWartBlock(settings: Settings?) {
        
    }

    companion object {
        private val AGE_TO_SHAPE = arrayOf(
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
        )
    }
}
