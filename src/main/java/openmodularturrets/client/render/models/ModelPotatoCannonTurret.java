package openmodularturrets.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelPotatoCannonTurret extends ModelBase {

    // fields
    public final ModelRenderer Base;
    public final ModelRenderer Pole;
    public final ModelRenderer BoxUnder;
    private final ModelRenderer BoxLeft;
    private final ModelRenderer BoxRight;
    private final ModelRenderer CrossBar;
    private final ModelRenderer Barrel;
    private final ModelRenderer Chamber;

    public ModelPotatoCannonTurret() {
        textureWidth = 64;
        textureHeight = 64;

        Base = new ModelRenderer(this, 0, 37);
        Base.addBox(-6F, 7F, -6F, 12, 1, 12);
        Base.setRotationPoint(0F, 16F, 0F);
        Base.setTextureSize(64, 32);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);

        Pole = new ModelRenderer(this, 0, 28);
        Pole.addBox(-2F, 4F, -2F, 4, 4, 4);
        Pole.setRotationPoint(0F, 16F, 0F);
        Pole.setTextureSize(64, 32);
        Pole.mirror = true;
        setRotation(Pole, 0F, 0F, 0F);

        BoxUnder = new ModelRenderer(this, 0, 15);
        BoxUnder.addBox(-4F, 3F, -4F, 8, 1, 8);
        BoxUnder.setRotationPoint(0F, 16F, 0F);
        BoxUnder.setTextureSize(64, 64);
        BoxUnder.mirror = true;
        setRotation(BoxUnder, 0F, 0F, 0F);
        BoxLeft = new ModelRenderer(this, 0, 15);
        BoxLeft.addBox(-4F, 4F, -4F, 8, 1, 8);
        BoxLeft.setRotationPoint(0F, 16F, 0F);
        BoxLeft.setTextureSize(64, 64);
        BoxLeft.mirror = true;
        setRotation(BoxLeft, 0F, 0F, ((float) Math.PI / 2F));
        BoxRight = new ModelRenderer(this, 0, 15);
        BoxRight.addBox(-4F, -5F, -4F, 8, 1, 8);
        BoxRight.setRotationPoint(0F, 16F, 0F);
        BoxRight.setTextureSize(64, 64);
        BoxRight.mirror = true;
        setRotation(BoxRight, 0F, 0F, ((float) Math.PI / 2F));
        CrossBar = new ModelRenderer(this, 0, 0);
        CrossBar.addBox(-4F, -2F, 0F, 8, 1, 1);
        CrossBar.setRotationPoint(0F, 16F, 0F);
        CrossBar.setTextureSize(64, 64);
        CrossBar.mirror = true;
        setRotation(CrossBar, 0F, 0F, 0F);
        Barrel = new ModelRenderer(this, 36, 0);
        Barrel.addBox(-1F, -2F, -11F, 2, 3, 12);
        Barrel.setRotationPoint(0F, 15F, 0F);
        Barrel.setTextureSize(64, 64);
        Barrel.mirror = true;
        setRotation(Barrel, 0F, 0F, 0F);
        Chamber = new ModelRenderer(this, 0, 4);
        Chamber.addBox(-2F, -3F, 1F, 4, 4, 4);
        Chamber.setRotationPoint(0F, 15F, 0F);
        Chamber.setTextureSize(64, 64);
        Chamber.mirror = true;
        setRotation(Chamber, 0F, 0F, 0F);
    }

    public void setRotationForTarget(float y, float z) {
        BoxUnder.rotateAngleY = z;
        BoxLeft.rotateAngleX = z;
        BoxRight.rotateAngleX = z;
        CrossBar.rotateAngleX = y;
        CrossBar.rotateAngleY = z;
        Barrel.rotateAngleX = y;
        Barrel.rotateAngleY = z;
        Chamber.rotateAngleX = y;
        Chamber.rotateAngleY = z;
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void renderAll() {
        Base.render(0.0625F);
        Pole.render(0.0625F);
        BoxUnder.render(0.0625F);
        BoxLeft.render(0.0625F);
        BoxRight.render(0.0625F);
        CrossBar.render(0.0625F);
        Barrel.render(0.0625F);
        Chamber.render(0.0625F);
    }
}
