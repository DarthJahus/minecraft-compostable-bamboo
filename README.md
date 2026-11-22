# Compostable Bamboo (Forge)

Makes **bamboo** compostable, with the same **30%** fill chance as other low-tier compostables (`compostable/low`).

Server-side / singleplayer. Clients do not need the mod.

## Mechanics

- Vanilla 26.3 composters only look at `DataComponents.COMPOSTABLE` on the `ItemStack` (`useItemOn`, `insertItem`, hopper `InputContainer`).
- Forge has no reliable way to attach that default component to vanilla bamboo, so this build synthesizes it in an `ItemStack` mixin for bamboo only (`ContextIntProviders.COMPOSTABLE_LOW` ≈ 30%).

## Credits

- Original mod : [MisterCheezeCake](https://github.com/MisterCheezeCake) ([CompostableBamboo](https://github.com/MisterCheezeCake/CompostableBamboo))
- 26.3 Fabric port & Forge/NeoForge ports: [Jahus](https://github.com/DarthJahus)

## License

[LGPL-3.0-or-later](LICENSE)
