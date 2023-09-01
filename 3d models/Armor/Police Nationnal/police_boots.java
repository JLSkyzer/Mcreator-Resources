// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class police_boots extends EntityModel<Entity> {
	private final ModelRenderer RightBoot;
	private final ModelRenderer LeftBoot;

	public police_boots() {
		textureWidth = 64;
		textureHeight = 64;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(0, 0).addBox(-2.25F, 10.0F, -4.25F, 4.5F, 2.0F, 6.5F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(0, 10).addBox(-2.3F, 10.0F, -4.25F, 4.5F, 2.0F, 6.5F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}