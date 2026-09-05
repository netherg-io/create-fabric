package com.simibubi.create.foundation.fabric;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BlockEntity;

import io.github.fabricators_of_create.porting_lib.entity.ext.EntityExt;

/**
 * Fabric replacement for NeoForge's {@code BlockEntity#getCustomData()} / {@code getPersistentData()}.
 * Implemented on every {@link BlockEntity} by {@code foundation.mixin.fabric.BlockEntityCustomDataMixin};
 * for entities porting lib already provides {@link EntityExt#getCustomData()}.
 */
public interface CustomDataHolder {

	CompoundTag create$getCustomData();

	static CompoundTag of(BlockEntity blockEntity) {
		return ((CustomDataHolder) blockEntity).create$getCustomData();
	}

	static CompoundTag of(Entity entity) {
		return ((EntityExt) entity).getCustomData();
	}
}
