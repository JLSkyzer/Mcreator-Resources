ListTag listTag = new ListTag();
String string = "{id:\"minecraft:unbreaking\",lvl:3s},{id:\"minecraft:sharpness\",lvl:5s}";
Pattern pattern = Pattern.compile("\\{id:\"(.*?)\",lvl:(\\d+)s\\}");
Matcher matcher = pattern.matcher(string);
while (matcher.find()) {
	String id = matcher.group(1);
	int lvl = Integer.parseInt(matcher.group(2));

	CompoundTag compoundTag = new CompoundTag();
	compoundTag.putString("id", id);
	compoundTag.putInt("lvl", lvl);

	listTag.add(compoundTag);
}
item = new ItemStack(Items.DIAMOND_AXE);
EnchantmentHelper.setEnchantments(EnchantmentHelper.deserializeEnchantments(listTag), item);