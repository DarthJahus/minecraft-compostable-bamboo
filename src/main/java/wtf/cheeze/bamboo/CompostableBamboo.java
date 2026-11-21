package wtf.cheeze.bamboo;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CompostableBamboo.MOD_ID)
public class CompostableBamboo {
	public static final String MOD_ID = "compostablebamboo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public CompostableBamboo(IEventBus modBus) {
		modBus.addListener(this::onModifyDefaultComponents);
	}

	private void onModifyDefaultComponents(ModifyDefaultComponentsEvent event) {
		event.modify(Items.BAMBOO, (components, context, item) -> {
			components.set(
					DataComponents.COMPOSTABLE,
					new Compostable(ContextIntProviders.COMPOSTABLE_LOW) // 30 %
			);
		});
		LOGGER.info("Bamboo is now compostable (30%)!");
	}
}
