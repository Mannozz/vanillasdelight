package manno.vanillasdelight.common.registry;

import manno.vanillasdelight.VanillasDelight;
import manno.vanillasdelight.common.effect.FulFillEffect;
import manno.vanillasdelight.common.effect.SatiateEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, VanillasDelight.MODID);
    public static final RegistryObject<MobEffect> FULFILL = EFFECTS.register("fulfill", FulFillEffect::new);

    public static final RegistryObject<MobEffect> SATIATE = EFFECTS.register("satiate", SatiateEffect::new);
}
