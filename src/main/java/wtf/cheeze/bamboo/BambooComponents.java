package wtf.cheeze.bamboo;

import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public final class BambooComponents {
    public static final DataComponentMap COMPOSTABLE_ONLY = DataComponentMap.builder()
            .set(DataComponents.COMPOSTABLE, new Compostable(ContextIntProviders.COMPOSTABLE_LOW))
            .build();

    private BambooComponents() {}
}
