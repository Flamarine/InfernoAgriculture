package dev.intelligentcreations.infernoagriculture

import dev.intelligentcreations.infernoagriculture.blocks.BlazeWartBlock
import net.fabricmc.api.ModInitializer
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Material
import net.minecraft.block.PlantBlock
import net.minecraft.item.AliasedBlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class InfernoAgriculture : ModInitializer {
    override fun onInitialize() {
        Registry.register(Registry.BLOCK, Identifier("inferno_agriculture", "blaze_wart_block"), BLAZE_WART_BLOCK)
        Registry.register(Registry.ITEM, Identifier("inferno_agriculture", "blaze_wart"), BLAZE_WART)
    }

    companion object {
        val BLAZE_WART_BLOCK: PlantBlock = BlazeWartBlock(
            AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly()
                .sounds(BlockSoundGroup.CROP)
        )
        val BLAZE_WART: Item = AliasedBlockItem(BLAZE_WART_BLOCK, Item.Settings().group(ItemGroup.MISC))
    }
}

