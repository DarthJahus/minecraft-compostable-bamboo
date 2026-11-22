package wtf.cheeze.bamboo.mixin;

import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import wtf.cheeze.bamboo.BambooComponents;


/**
 * ComposterBlock only checks {@code itemStack.get/has(DataComponents.COMPOSTABLE)}
 * (useItemOn, insertItem, InputContainer). Forge cannot attach default components
 * to vanilla bamboo reliably, so we synthesize the component on the stack.
 */
@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

	@Inject(method = "getComponents", at = @At("RETURN"), cancellable = true)
	private void compostableBamboo$getComponents(CallbackInfoReturnable<DataComponentMap> cir) {
		ItemStack self = (ItemStack) (Object) this;
		if (!self.is(Items.BAMBOO)) {
			return;
		}
		DataComponentMap original = cir.getReturnValue();
		if (original.has(DataComponents.COMPOSTABLE)) {
			return;
		}
		cir.setReturnValue(DataComponentMap.composite(BambooComponents.COMPOSTABLE_ONLY, original));
	}
}
