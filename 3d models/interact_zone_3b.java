// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class interact_zone_3b extends EntityModel<Entity> {
	private final ModelRenderer hexadecagon;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;

	public interact_zone_3b() {
		textureWidth = 16;
		textureHeight = 16;

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(0.0F, 25.9F, 0.0F);
		hexadecagon.setTextureOffset(0, 0).addBox(-4.2261F, -3.9F, -24.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon.setTextureOffset(0, 0).addBox(-4.2261F, -3.9F, 16.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon.setTextureOffset(0, 0).addBox(16.0F, -3.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);
		hexadecagon.setTextureOffset(0, 0).addBox(-24.0F, -3.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
		hexadecagon.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-24.0F, -0.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(16.0F, -0.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, 16.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, -24.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -3.0F, 0.0F);
		hexadecagon.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-24.0F, -0.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(16.0F, -0.9F, -4.7739F, 8.0F, 0.5F, 9.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, 16.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, -24.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -3.0F, 0.0F);
		hexadecagon.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, 16.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon_r3.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, -24.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -3.0F, 0.0F);
		hexadecagon.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, 16.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
		hexadecagon_r4.setTextureOffset(0, 0).addBox(-4.2261F, -0.9F, -24.0F, 9.0F, 0.5F, 8.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		hexadecagon.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}