package uson.rta.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public final class rtaItems {
	
	//{TOOL TYPES}
	public static ToolMaterial CARBONTOOL=EnumHelper.addToolMaterial("carbon", 1, 250, 4.0F, 1, 10);
	public static ToolMaterial BLAZETOOL=EnumHelper.addToolMaterial("blaze", 3, 131, 10.0F, 2, 14);
	public static ToolMaterial IRONREFTOOL=EnumHelper.addToolMaterial("ironrefined", 2, 501, 7.0F, 3, 18);
	public static ToolMaterial GOLDREFTOOL=EnumHelper.addToolMaterial("goldrefined", 3, 250, 10.0F, 2, 22);
	public static ToolMaterial DIAMONDREFTOOL=EnumHelper.addToolMaterial("diamondrefined", 3, 3123, 12.0F, 4, 14);
	public static ToolMaterial POWERTOOL=EnumHelper.addToolMaterial("power", 3, 9371, 16.0F, 6, 5);
	
	//{ARMOR TYPES}
	public static ArmorMaterial CARBONARMOR=EnumHelper.addArmorMaterial("carbon", 10, new int[]{2, 4, 2, 2}, 12);
	public static ArmorMaterial BLAZEARMOR=EnumHelper.addArmorMaterial("blaze", 10, new int[]{2, 4, 2, 2}, 12);
	public static ArmorMaterial IRONREFARMOR=EnumHelper.addArmorMaterial("ironrefined", 24, new int[]{4, 9, 7, 4}, 12);
	public static ArmorMaterial GOLDREFARMOR=EnumHelper.addArmorMaterial("goldrefined", 14, new int[]{3, 5, 3, 3}, 25);
	public static ArmorMaterial DIAMONDREFARMOR=EnumHelper.addArmorMaterial("diamondrefined", 41, new int[]{7, 16, 12, 6}, 15);
	public static ArmorMaterial POWERARMOR=EnumHelper.addArmorMaterial("power",53, new int[]{10, 19, 15, 9}, 9);
	
	//{MATERIALS}
	public static Item carbonChunk;
	public static Item carbonRefined;
	public static Item blazeChunk;
	public static Item blazeRefined;
	public static Item ironChunk;
	public static Item ironRefined;
	public static Item goldChunk;
	public static Item goldRefined;
	public static Item diamondChunk;
	public static Item diamondRefined;
	public static Item powerChunk;
	public static Item powerRefined;
	
	//{EQUIPMENT}
	public static rtaAxe carbonAxe;
	public static rtaHoe carbonHoe;
	public static rtaPickaxe carbonPickaxe;
	public static rtaShovel carbonShovel;
	public static rtaSword carbonSword;
	public static rtaArmor carbonHelm;
	public static rtaArmor carbonArmor;
	public static rtaArmor carbonPants;
	public static rtaArmor carbonBoots;
	public static rtaAxe blazeAxe;
	public static rtaHoe blazeHoe;
	public static rtaPickaxe blazePickaxe;
	public static rtaShovel blazeShovel;
	public static rtaSword blazeSword;
	public static rtaArmor blazeHelm;
	public static rtaArmor blazeArmor;
	public static rtaArmor blazePants;
	public static rtaArmor blazeBoots;
	public static rtaAxe ironRefinedAxe;
	public static rtaHoe ironRefinedHoe;
	public static rtaPickaxe ironRefinedPickaxe;
	public static rtaShovel ironRefinedShovel;
	public static rtaSword ironRefinedSword;
	public static rtaArmor ironRefinedHelm;
	public static rtaArmor ironRefinedArmor;
	public static rtaArmor ironRefinedPants;
	public static rtaArmor ironRefinedBoots;
	public static rtaAxe goldRefinedAxe;
	public static rtaHoe goldRefinedHoe;
	public static rtaPickaxe goldRefinedPickaxe;
	public static rtaShovel goldRefinedShovel;
	public static rtaSword goldRefinedSword;
	public static rtaArmor goldRefinedHelm;
	public static rtaArmor goldRefinedArmor;
	public static rtaArmor goldRefinedPants;
	public static rtaArmor goldRefinedBoots;
	public static rtaAxe diamondRefinedAxe;
	public static rtaHoe diamondRefinedHoe;
	public static rtaPickaxe diamondRefinedPickaxe;
	public static rtaShovel diamondRefinedShovel;
	public static rtaSword diamondRefinedSword;
	public static rtaArmor diamondRefinedHelm;
	public static rtaArmor diamondRefinedArmor;
	public static rtaArmor diamondRefinedPants;
	public static rtaArmor diamondRefinedBoots;
	public static rtaAxe powerAxe;
	public static rtaHoe powerHoe;
	public static rtaPickaxe powerPickaxe;
	public static rtaShovel powerShovel;
	public static rtaSword powerSword;
	public static rtaArmor powerHelm;
	public static rtaArmor powerArmor;
	public static rtaArmor powerPants;
	public static rtaArmor powerBoots;
	
	public static void init() {
		
		//{CARBON}
		
		//{IDENTIFICATION}
		carbonChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_carbonChunk").setTextureName("rta:carbonChunk");
		carbonRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_carbonRefined").setTextureName("rta:carbonRefined");
		carbonAxe = new rtaAxe(CARBONTOOL, "carbon");
		carbonHoe = new rtaHoe(CARBONTOOL, "carbon");
		carbonPickaxe = new rtaPickaxe(CARBONTOOL, "carbon");
		carbonShovel = new rtaShovel(CARBONTOOL, "carbon");
		carbonSword = new rtaSword(CARBONTOOL, "carbon");
		carbonHelm = new rtaArmor(CARBONARMOR, 0, "carbonHelm");
		carbonArmor = new rtaArmor(CARBONARMOR, 1, "carbonArmor");
		carbonPants = new rtaArmor(CARBONARMOR, 2, "carbonPants");
		carbonBoots = new rtaArmor(CARBONARMOR, 3, "carbonBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(carbonChunk, "carbonChunk");
		GameRegistry.registerItem(carbonRefined, "carbonRefined");
		GameRegistry.registerItem(carbonAxe, "carbonAxe");
		GameRegistry.registerItem(carbonHoe, "carbonHoe");
		GameRegistry.registerItem(carbonPickaxe, "carbonPickaxe");
		GameRegistry.registerItem(carbonShovel, "carbonShovel");
		GameRegistry.registerItem(carbonSword, "carbonSword");
		GameRegistry.registerItem(carbonHelm, "carbonHelm");
		GameRegistry.registerItem(carbonArmor, "carbonArmor");
		GameRegistry.registerItem(carbonPants, "carbonPants");
		GameRegistry.registerItem(carbonBoots, "carbonBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(carbonChunk, 1), new Object[]{"cc ", "cc ", "   ", 'c', Items.coal});
		GameRegistry.addRecipe(new ItemStack(carbonChunk, 1), new Object[]{" cc", " cc", "   ", 'c', Items.coal});
		GameRegistry.addRecipe(new ItemStack(carbonChunk, 1), new Object[]{"   ", "cc ", "cc ", 'c', Items.coal});
		GameRegistry.addRecipe(new ItemStack(carbonChunk, 1), new Object[]{"   ", " cc", " cc", 'c', Items.coal});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 4), new Object[]{carbonChunk});
		GameRegistry.addSmelting(carbonChunk, new ItemStack(carbonRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(carbonAxe, 1), new Object[]{"cc ", "cs ", " s ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonAxe, 1), new Object[]{" cc", " cs", "  s", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonHoe, 1), new Object[]{"cc ", " s ", " s ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonHoe, 1), new Object[]{" cc", "  s", "  s", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonPickaxe, 1), new Object[]{"ccc", " s ", " s ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonShovel, 1), new Object[]{" c ", " s ", " s ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonShovel, 1), new Object[]{"c  ", "s  ", "s  ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonShovel, 1), new Object[]{"  c", "  s", "  s", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonSword, 1), new Object[]{" c ", " c ", " s ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonSword, 1), new Object[]{"c  ", "c  ", "s  ", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonSword, 1), new Object[]{"  c", "  c", "  s", 'c', carbonRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(carbonHelm, 1), new Object[]{"ccc", "c c", "   ", 'c', carbonRefined});
		GameRegistry.addRecipe(new ItemStack(carbonHelm, 1), new Object[]{"   ", "ccc", "c c", 'c', carbonRefined});
		GameRegistry.addRecipe(new ItemStack(carbonArmor, 1), new Object[]{"c c", "ccc", "ccc", 'c', carbonRefined});
		GameRegistry.addRecipe(new ItemStack(carbonPants, 1), new Object[]{"ccc", "c c", "c c", 'c', carbonRefined});
		GameRegistry.addRecipe(new ItemStack(carbonBoots, 1), new Object[]{"   ", "c c", "c c", 'c', carbonRefined});
		GameRegistry.addRecipe(new ItemStack(carbonBoots, 1), new Object[]{"c c", "c c", "   ", 'c', carbonRefined});
		
		//{BLAZE}
		
		//{IDENTIFICATION}
		blazeChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_blazeChunk").setTextureName("rta:blazeChunk");
		blazeRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_blazeRefined").setTextureName("rta:blazeRefined");
		blazeAxe = new rtaAxe(BLAZETOOL, "blaze");
		blazeHoe = new rtaHoe(BLAZETOOL, "blaze");
		blazePickaxe = new rtaPickaxe(BLAZETOOL, "blaze");
		blazeShovel = new rtaShovel(BLAZETOOL, "blaze");
		blazeSword = new rtaSword(BLAZETOOL, "blaze");
		blazeHelm = new rtaArmor(BLAZEARMOR, 0, "blazeHelm");
		blazeArmor = new rtaArmor(BLAZEARMOR, 1, "blazeArmor");
		blazePants = new rtaArmor(BLAZEARMOR, 2, "blazePants");
		blazeBoots = new rtaArmor(BLAZEARMOR, 3, "blazeBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(blazeChunk, "blazeChunk");
		GameRegistry.registerItem(blazeRefined, "blazeRefined");
		GameRegistry.registerItem(blazeAxe, "blazeAxe");
		GameRegistry.registerItem(blazeHoe, "blazeHoe");
		GameRegistry.registerItem(blazePickaxe, "blazePickaxe");
		GameRegistry.registerItem(blazeShovel, "blazeShovel");
		GameRegistry.registerItem(blazeSword, "blazeSword");
		GameRegistry.registerItem(blazeHelm, "blazeHelm");
		GameRegistry.registerItem(blazeArmor, "blazeArmor");
		GameRegistry.registerItem(blazePants, "blazePants");
		GameRegistry.registerItem(blazeBoots, "blazeBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{"b  ", "b  ", "   ", 'b', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{" b ", " b ", "   ", 'b', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{"  b", "  b", "   ", 'b', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{"   ", "b  ", "b  ", 'b', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{"   ", " b ", " b ", 'b', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(blazeChunk, 1), new Object[]{"   ", "  b", "  b", 'b', Items.blaze_rod});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 2), new Object[]{blazeChunk});
		GameRegistry.addSmelting(blazeChunk, new ItemStack(blazeRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(blazeAxe, 1), new Object[]{"bb ", "bs ", " s ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeAxe, 1), new Object[]{" bb", " bs", "  s", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeHoe, 1), new Object[]{"bb ", " s ", " s ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeHoe, 1), new Object[]{" bb", "  s", "  s", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazePickaxe, 1), new Object[]{"bbb", " s ", " s ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeShovel, 1), new Object[]{" b ", " s ", " s ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeShovel, 1), new Object[]{"b  ", "s  ", "s  ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeShovel, 1), new Object[]{"  b", "  s", "  s", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeSword, 1), new Object[]{" b ", " b ", " s ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeSword, 1), new Object[]{"b  ", "b  ", "s  ", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeSword, 1), new Object[]{"  b", "  b", "  s", 'b', blazeRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blazeHelm, 1), new Object[]{"bbb", "b b", "   ", 'b', blazeRefined});
		GameRegistry.addRecipe(new ItemStack(blazeHelm, 1), new Object[]{"   ", "bbb", "b b", 'b', blazeRefined});
		GameRegistry.addRecipe(new ItemStack(blazeArmor, 1), new Object[]{"b b", "bbb", "bbb", 'b', blazeRefined});
		GameRegistry.addRecipe(new ItemStack(blazePants, 1), new Object[]{"bbb", "b b", "b b", 'b', blazeRefined});
		GameRegistry.addRecipe(new ItemStack(blazeBoots, 1), new Object[]{"   ", "b b", "b b", 'b', blazeRefined});
		GameRegistry.addRecipe(new ItemStack(blazeBoots, 1), new Object[]{"b b", "b b", "   ", 'b', blazeRefined});
		
		//{REFINED IRON}
		
		//{IDENTIFICATION}
		ironChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_ironChunk").setTextureName("rta:ironChunk");
		ironRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_ironRefined").setTextureName("rta:ironRefined");
		ironRefinedAxe = new rtaAxe(IRONREFTOOL, "ironRefined");
		ironRefinedHoe = new rtaHoe(IRONREFTOOL, "ironRefined");
		ironRefinedPickaxe = new rtaPickaxe(IRONREFTOOL, "ironRefined");
		ironRefinedShovel = new rtaShovel(IRONREFTOOL, "ironRefined");
		ironRefinedSword = new rtaSword(IRONREFTOOL, "ironRefined");
		ironRefinedHelm = new rtaArmor(IRONREFARMOR, 0, "ironRefinedHelm");
		ironRefinedArmor = new rtaArmor(IRONREFARMOR, 1, "ironRefinedArmor");
		ironRefinedPants = new rtaArmor(IRONREFARMOR, 2, "ironRefinedPants");
		ironRefinedBoots = new rtaArmor(IRONREFARMOR, 3, "ironRefinedBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(ironChunk, "ironChunk");
		GameRegistry.registerItem(ironRefined, "ironRefined");
		GameRegistry.registerItem(ironRefinedAxe, "ironRefinedAxe");
		GameRegistry.registerItem(ironRefinedHoe, "ironRefinedHoe");
		GameRegistry.registerItem(ironRefinedPickaxe, "ironRefinedPickaxe");
		GameRegistry.registerItem(ironRefinedShovel, "ironRefinedShovel");
		GameRegistry.registerItem(ironRefinedSword, "ironRefinedSword");
		GameRegistry.registerItem(ironRefinedHelm, "ironRefinedHelm");
		GameRegistry.registerItem(ironRefinedArmor, "ironRefinedArmor");
		GameRegistry.registerItem(ironRefinedPants, "ironRefinedPants");
		GameRegistry.registerItem(ironRefinedBoots, "ironRefinedBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{"i  ", "i  ", "   ", 'i' , Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{" i ", " i ", "   ", 'i' , Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{"  i", "  i", "   ", 'i' , Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{"   ", "i  ", "i  ", 'i' , Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{"   ", " i ", " i ", 'i' , Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ironChunk, 1), new Object[]{"   ", "  i", "  i", 'i' , Items.iron_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new Object[]{ironChunk});
		GameRegistry.addSmelting(ironChunk, new ItemStack(ironRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(ironRefinedAxe, 1), new Object[]{"ii ", "is ", " s ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedAxe, 1), new Object[]{" ii", " is", "  s", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedHoe, 1), new Object[]{"ii ", " s ", " s ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedHoe, 1), new Object[]{" ii", "  s", "  s", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedPickaxe, 1), new Object[]{"iii", " s ", " s ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedShovel, 1), new Object[]{" i ", " s ", " s ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedShovel, 1), new Object[]{"i  ", "s  ", "s  ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedShovel, 1), new Object[]{"  i", "  s", "  s", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedSword, 1), new Object[]{" i ", " i ", " s ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedSword, 1), new Object[]{"i  ", "i  ", "s  ", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedSword, 1), new Object[]{"  i", "  i", "  s", 'i', ironRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ironRefinedHelm, 1), new Object[]{"iii", "i i", "   ", 'i', ironRefined});
		GameRegistry.addRecipe(new ItemStack(ironRefinedHelm, 1), new Object[]{"   ", "iii", "i i", 'i', ironRefined});
		GameRegistry.addRecipe(new ItemStack(ironRefinedArmor, 1), new Object[]{"i i", "iii", "iii", 'i', ironRefined});
		GameRegistry.addRecipe(new ItemStack(ironRefinedPants, 1), new Object[]{"iii", "i i", "i i", 'i', ironRefined});
		GameRegistry.addRecipe(new ItemStack(ironRefinedBoots, 1), new Object[]{"   ", "i i", "i i", 'i', ironRefined});
		GameRegistry.addRecipe(new ItemStack(ironRefinedBoots, 1), new Object[]{"i i", "i i", "   ", 'i', ironRefined});

		//{REFINED GOLD}
		
		//{IDENTIFICATION}
		goldChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_goldChunk").setTextureName("rta:goldChunk");
		goldRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_goldRefined").setTextureName("rta:goldRefined");
		goldRefinedAxe = new rtaAxe(GOLDREFTOOL, "goldRefined");
		goldRefinedHoe = new rtaHoe(GOLDREFTOOL, "goldRefined");
		goldRefinedPickaxe = new rtaPickaxe(GOLDREFTOOL, "goldRefined");
		goldRefinedShovel = new rtaShovel(GOLDREFTOOL, "goldRefined");
		goldRefinedSword = new rtaSword(GOLDREFTOOL, "goldRefined");
		goldRefinedHelm = new rtaArmor(GOLDREFARMOR, 0, "goldRefinedHelm");
		goldRefinedArmor = new rtaArmor(GOLDREFARMOR, 1, "goldRefinedArmor");
		goldRefinedPants = new rtaArmor(GOLDREFARMOR, 2, "goldRefinedPants");
		goldRefinedBoots = new rtaArmor(GOLDREFARMOR, 3, "goldRefinedBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(goldChunk, "goldChunk");
		GameRegistry.registerItem(goldRefined, "goldRefined");
		GameRegistry.registerItem(goldRefinedAxe, "goldRefinedAxe");
		GameRegistry.registerItem(goldRefinedHoe, "goldRefinedHoe");
		GameRegistry.registerItem(goldRefinedPickaxe, "goldRefinedPickaxe");
		GameRegistry.registerItem(goldRefinedShovel, "goldRefinedShovel");
		GameRegistry.registerItem(goldRefinedSword, "goldRefinedSword");
		GameRegistry.registerItem(goldRefinedHelm, "goldRefinedHelm");
		GameRegistry.registerItem(goldRefinedArmor, "goldRefinedArmor");
		GameRegistry.registerItem(goldRefinedPants, "goldRefinedPants");
		GameRegistry.registerItem(goldRefinedBoots, "goldRefinedBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{"g  ", "g  ", "   ", 'g' , Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{" g ", " g ", "   ", 'g' , Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{"  g", "  g", "   ", 'g' , Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{"   ", "g  ", "g  ", 'g' , Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{"   ", " g ", " g ", 'g' , Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(goldChunk, 1), new Object[]{"   ", "  g", "  g", 'g' , Items.gold_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new Object[]{goldChunk});
		GameRegistry.addSmelting(goldChunk, new ItemStack(goldRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(goldRefinedAxe, 1), new Object[]{"gg ", "gs ", " s ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedAxe, 1), new Object[]{" gg", " gs", "  s", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedHoe, 1), new Object[]{"gg ", " s ", " s ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedHoe, 1), new Object[]{" gg", "  s", "  s", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedPickaxe, 1), new Object[]{"ggg", " s ", " s ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedShovel, 1), new Object[]{" g ", " s ", " s ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedShovel, 1), new Object[]{"g  ", "s  ", "s  ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedShovel, 1), new Object[]{"  g", "  s", "  s", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedSword, 1), new Object[]{" g ", " g ", " s ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedSword, 1), new Object[]{"g  ", "g  ", "s  ", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedSword, 1), new Object[]{"  g", "  g", "  s", 'g', goldRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(goldRefinedHelm, 1), new Object[]{"ggg", "g g", "   ", 'g', goldRefined});
		GameRegistry.addRecipe(new ItemStack(goldRefinedHelm, 1), new Object[]{"   ", "ggg", "g g", 'g', goldRefined});
		GameRegistry.addRecipe(new ItemStack(goldRefinedArmor, 1), new Object[]{"g g", "ggg", "ggg", 'g', goldRefined});
		GameRegistry.addRecipe(new ItemStack(goldRefinedPants, 1), new Object[]{"ggg", "g g", "g g", 'g', goldRefined});
		GameRegistry.addRecipe(new ItemStack(goldRefinedBoots, 1), new Object[]{"   ", "g g", "g g", 'g', goldRefined});
		GameRegistry.addRecipe(new ItemStack(goldRefinedBoots, 1), new Object[]{"g g", "g g", "   ", 'g', goldRefined});

		
		//{REFINED DIAMOND}
		
		//{IDENTIFICATION}
		diamondChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_diamondChunk").setTextureName("rta:diamondChunk");
		diamondRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_diamondRefined").setTextureName("rta:diamondRefined");
		diamondRefinedAxe = new rtaAxe(DIAMONDREFTOOL, "diamondRefined");
		diamondRefinedHoe = new rtaHoe(DIAMONDREFTOOL, "diamondRefined");
		diamondRefinedPickaxe = new rtaPickaxe(DIAMONDREFTOOL, "diamondRefined");
		diamondRefinedShovel = new rtaShovel(DIAMONDREFTOOL, "diamondRefined");
		diamondRefinedSword = new rtaSword(DIAMONDREFTOOL, "diamondRefined");
		diamondRefinedHelm = new rtaArmor(DIAMONDREFARMOR, 0, "diamondRefinedHelm");
		diamondRefinedArmor = new rtaArmor(DIAMONDREFARMOR, 1, "diamondRefinedArmor");
		diamondRefinedPants = new rtaArmor(DIAMONDREFARMOR, 2, "diamondRefinedPants");
		diamondRefinedBoots = new rtaArmor(DIAMONDREFARMOR, 3, "diamondRefinedBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(diamondChunk, "diamondChunk");
		GameRegistry.registerItem(diamondRefined, "diamondRefined");
		GameRegistry.registerItem(diamondRefinedAxe, "diamondRefinedAxe");
		GameRegistry.registerItem(diamondRefinedHoe, "diamondRefinedHoe");
		GameRegistry.registerItem(diamondRefinedPickaxe, "diamondRefinedPickaxe");
		GameRegistry.registerItem(diamondRefinedShovel, "diamondRefinedShovel");
		GameRegistry.registerItem(diamondRefinedSword, "diamondRefinedSword");
		GameRegistry.registerItem(diamondRefinedHelm, "diamondRefinedHelm");
		GameRegistry.registerItem(diamondRefinedArmor, "diamondRefinedArmor");
		GameRegistry.registerItem(diamondRefinedPants, "diamondRefinedPants");
		GameRegistry.registerItem(diamondRefinedBoots, "diamondRefinedBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(diamondChunk, 1), new Object[]{"qdq", "qdq", "   ", 'q', Items.quartz, 'd', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(diamondChunk, 1), new Object[]{"   ", "qdq", "qdq", 'q', Items.quartz, 'd', Items.diamond});
		GameRegistry.addSmelting(diamondChunk, new ItemStack(diamondRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(diamondRefinedAxe, 1), new Object[]{"dd ", "ds ", " s ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedAxe, 1), new Object[]{" dd", " ds", "  s", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedHoe, 1), new Object[]{"dd ", " s ", " s ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedHoe, 1), new Object[]{" dd", "  s", "  s", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedPickaxe, 1), new Object[]{"ddd", " s ", " s ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedShovel, 1), new Object[]{" d ", " s ", " s ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedShovel, 1), new Object[]{"d  ", "s  ", "s  ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedShovel, 1), new Object[]{"  d", "  s", "  s", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedSword, 1), new Object[]{" d ", " d ", " s ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedSword, 1), new Object[]{"d  ", "d  ", "s  ", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedSword, 1), new Object[]{"  d", "  d", "  s", 'd', diamondRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedHelm, 1), new Object[]{"ddd", "d d", "   ", 'd', diamondRefined});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedHelm, 1), new Object[]{"   ", "ddd", "d d", 'd', diamondRefined});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedArmor, 1), new Object[]{"d d", "ddd", "ddd", 'd', diamondRefined});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedPants, 1), new Object[]{"ddd", "d d", "d d", 'd', diamondRefined});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedBoots, 1), new Object[]{"   ", "d d", "d d", 'd', diamondRefined});
		GameRegistry.addRecipe(new ItemStack(diamondRefinedBoots, 1), new Object[]{"d d", "d d", "   ", 'd', diamondRefined});
		
		//{POWER}
		
		//{IDENTIFICATION}
		powerChunk = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_powerChunk").setTextureName("rta:powerChunk");
		powerRefined = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("rta_powerRefined").setTextureName("rta:powerRefined");
		powerAxe = new rtaAxe(POWERTOOL, "power");
		powerHoe = new rtaHoe(POWERTOOL, "power");
		powerPickaxe = new rtaPickaxe(POWERTOOL, "power");
		powerShovel = new rtaShovel(POWERTOOL, "power");
		powerSword = new rtaSword(POWERTOOL, "power");
		powerHelm = new rtaArmor(POWERARMOR, 0, "powerHelm");
		powerArmor = new rtaArmor(POWERARMOR, 1, "powerArmor");
		powerPants = new rtaArmor(POWERARMOR, 2, "powerPants");
		powerBoots = new rtaArmor(POWERARMOR, 3, "powerBoots");
		
		//{REGISTRATION}
		GameRegistry.registerItem(powerChunk, "powerChunk");
		GameRegistry.registerItem(powerRefined, "powerRefined");
		GameRegistry.registerItem(powerAxe, "powerAxe");
		GameRegistry.registerItem(powerHoe, "powerHoe");
		GameRegistry.registerItem(powerPickaxe, "powerPickaxe");
		GameRegistry.registerItem(powerShovel, "powerShovel");
		GameRegistry.registerItem(powerSword, "powerSword");
		GameRegistry.registerItem(powerHelm, "powerHelm");
		GameRegistry.registerItem(powerArmor, "powerArmor");
		GameRegistry.registerItem(powerPants, "powerPants");
		GameRegistry.registerItem(powerBoots, "powerBoots");
		
		//{RECIPICATION}
		GameRegistry.addRecipe(new ItemStack(powerChunk, 1), new Object[]{"idi", "iri", "idi", 'i', ironRefined, 'd', diamondRefined, 'r', Items.redstone});
		GameRegistry.addSmelting(powerChunk, new ItemStack(powerRefined, 1), 1f);
		GameRegistry.addRecipe(new ItemStack(powerAxe, 1), new Object[]{"gg ", "gs ", " s ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerAxe, 1), new Object[]{" gg", " gs", "  s", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerHoe, 1), new Object[]{"gg ", " s ", " s ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerHoe, 1), new Object[]{" gg", "  s", "  s", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerPickaxe, 1), new Object[]{"ggg", " s ", " s ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerShovel, 1), new Object[]{" g ", " s ", " s ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerShovel, 1), new Object[]{"g  ", "s  ", "s  ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerShovel, 1), new Object[]{"  g", "  s", "  s", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerSword, 1), new Object[]{" g ", " g ", " s ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerSword, 1), new Object[]{"g  ", "g  ", "s  ", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerSword, 1), new Object[]{"  g", "  g", "  s", 'g', powerRefined, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(powerHelm, 1), new Object[]{"ggg", "g g", "   ", 'g', powerRefined});
		GameRegistry.addRecipe(new ItemStack(powerHelm, 1), new Object[]{"   ", "ggg", "g g", 'g', powerRefined});
		GameRegistry.addRecipe(new ItemStack(powerArmor, 1), new Object[]{"g g", "ggg", "ggg", 'g', powerRefined});
		GameRegistry.addRecipe(new ItemStack(powerPants, 1), new Object[]{"ggg", "g g", "g g", 'g', powerRefined});
		GameRegistry.addRecipe(new ItemStack(powerBoots, 1), new Object[]{"   ", "g g", "g g", 'g', powerRefined});
		GameRegistry.addRecipe(new ItemStack(powerBoots, 1), new Object[]{"g g", "g g", "   ", 'g', powerRefined});
		
	}
}
