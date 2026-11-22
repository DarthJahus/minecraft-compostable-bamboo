package wtf.cheeze.bamboo;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CompostableBamboo.MOD_ID)
public class CompostableBamboo {
	public static final String MOD_ID = "compostablebamboo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public CompostableBamboo() {
		LOGGER.info("Bamboo is now compostable (30%)!");
	}
}
