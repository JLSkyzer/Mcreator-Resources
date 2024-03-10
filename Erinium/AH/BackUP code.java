private String MakeString(int width, String text){
		Font font = Minecraft.getInstance().font;

		String resulttext = text;
		int maxWidth = width;

		if (font.width(resulttext) > maxWidth) {
			resulttext = font.plainSubstrByWidth(resulttext, maxWidth - font.width("...")) + "...";
		}

		return resulttext;
	}

// protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY)
guiGraphics.drawString(this.font,

				MakeString(160, Line0ItemNameProcedure.execute(entity)), 25, 32, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line1ItemNameProcedure.execute(entity)), 25, 63, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line2ItemNameProcedure.execute(entity)), 25, 94, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line3ItemNameProcedure.execute(entity)), 25, 125, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line4ItemNameProcedure.execute(entity)), 25, 156, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line5ItemNameProcedure.execute(entity)), 25, 187, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(160, Line6ItemNameProcedure.execute(entity)), 25, 218, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line0PlayerNameProcedure.execute(entity)), 186, 32, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line1PlayerNameProcedure.execute(entity)), 186, 63, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line2PlayerNameProcedure.execute(entity)), 186, 94, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line3PlayerNameProcedure.execute(entity)), 186, 125, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line4PlayerNameProcedure.execute(entity)), 186, 156, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line5PlayerNameProcedure.execute(entity)), 186, 187, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(100, Line6PlayerNameProcedure.execute(entity)), 186, 218, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line0QuantityProcedure.execute(entity)), 287, 27, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line0PriceProcedure.execute(entity)), 287, 37, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line1QuantityProcedure.execute(entity)), 287, 58, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line1PriceProcedure.execute(entity)), 287, 68, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line2QuantityProcedure.execute(entity)), 287, 89, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line2PriceProcedure.execute(entity)), 287, 99, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line3QuantityProcedure.execute(entity)), 287, 120, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line3PriceProcedure.execute(entity)), 287, 130, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line4QuantityProcedure.execute(entity)), 287, 151, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line4PriceProcedure.execute(entity)), 287, 161, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line5QuantityProcedure.execute(entity)), 287, 182, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line5PriceProcedure.execute(entity)), 287, 192, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line6QuantityProcedure.execute(entity)), 287, 213, -12829636, false);
		guiGraphics.drawString(this.font,

				MakeString(60, Line6PriceProcedure.execute(entity)), 287, 223, -12829636, false);
		guiGraphics.drawString(this.font,

				GetMoneyMainPageProcedure.execute(world, entity), 427 - this.font.width(GetMoneyMainPageProcedure.execute(world, entity)) - 1, 0, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.erinium_ah.ah_main_menu.label_market"), 1, 1, -16750951, false);