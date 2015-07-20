package openmodularturrets.client.render.renderers.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import openmodularturrets.client.render.models.ModelExpander;
import openmodularturrets.client.render.renderers.blockitem.ExpanderInvTierFiveRenderer;
import openmodularturrets.tileentity.expander.ExpanderInvTierFiveTileEntity;
import org.lwjgl.opengl.GL11;

public class ExpanderInvTierFiveItemRenderer implements IItemRenderer {

    private final ExpanderInvTierFiveRenderer expanderInvTierFiveRenderer;
    private final ExpanderInvTierFiveTileEntity expanderInvTierFiveTileEntity;
    private final ModelExpander model;

    public ExpanderInvTierFiveItemRenderer(ExpanderInvTierFiveRenderer expanderInvTierFiveRenderer, ExpanderInvTierFiveTileEntity expanderInvTierFiveTileEntity) {
        this.expanderInvTierFiveRenderer = expanderInvTierFiveRenderer;
        this.expanderInvTierFiveTileEntity = expanderInvTierFiveTileEntity;
        this.model = new ModelExpander();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        GL11.glTranslated(-0.5, -0.5, -0.5);
        this.expanderInvTierFiveRenderer.renderTileEntityAt(this.expanderInvTierFiveTileEntity, 0.0D, 0.0D, 0.0D,
                0.0F);
        GL11.glPopMatrix();
    }
}