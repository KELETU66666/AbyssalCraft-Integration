package com.shinoow.acintegration.integrations.tinkers;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.traits.AbstractTrait;

import com.shinoow.abyssalcraft.common.util.EntityUtil;

public class TraitDreadPurity extends AbstractTrait {

	public TraitDreadPurity() {
		super("dreadpurity", TextFormatting.DARK_PURPLE);
	}

	@Override
	public float damage(ItemStack tool,  EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {

		if(EntityUtil.isEntityDread(target) && !EntityUtil.isEntityAnti(target) && !EntityUtil.isEntityCoralium(target))
			return super.damage(tool, player, target, damage, newDamage * 1.25F, isCritical);
		return super.damage(tool, player, target, damage, newDamage, isCritical);
	}
}