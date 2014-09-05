package uson.ata.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ataArmor extends ItemArmor {

	public ataArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName("ata_" + name);
		setTextureName("ata:" + name);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ataItems.garnetHelm || stack.getItem() == ataItems.garnetArmor || stack.getItem() == ataItems.garnetBoots) {
			return "ata:models/armor/garnet_layer_1.png";
		}
		else if(stack.getItem() == ataItems.garnetPants) {
			return "ata:models/armor/garnet_layer_2.png";
		}
		else if(stack.getItem() == ataItems.malachiteHelm || stack.getItem() == ataItems.malachiteArmor || stack.getItem() == ataItems.malachiteBoots) {
			return "ata:models/armor/malachite_layer_1.png";
		}
		else if(stack.getItem() == ataItems.malachitePants) {
			return "ata:models/armor/malachite_layer_2.png";
		}
		else if(stack.getItem() == ataItems.sodaliteHelm || stack.getItem() == ataItems.sodaliteArmor || stack.getItem() == ataItems.sodaliteBoots) {
			return "ata:models/armor/sodalite_layer_1.png";
		}
		else if(stack.getItem() == ataItems.sodalitePants) {
			return "ata:models/armor/sodalite_layer_2.png";
		}
		return null;
	}
}
