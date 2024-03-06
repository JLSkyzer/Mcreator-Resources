String result = item.getOrCreateTagElement("display").get("Lore").toString();
			result = result.replaceAll("'", "");

			JsonArray jsonArray = JsonParser.parseString(result).getAsJsonArray();
			for (int i = 0; i < jsonArray.size(); i++) {
				JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
				String text = jsonObject.get("text").getAsString();
			}