package dev.intelligentcreations.infernoagriculture

import dev.intelligentcreations.infernoagriculture.InfernoAgriculture.Companion.BLAZE_WART_BLOCK
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer


class InfernoAgricultureClient : ClientModInitializer {
    override fun onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BLAZE_WART_BLOCK)
    }
}