package com.modforge.writeaminecraftpaper1;

import net.fabricmc.api.ClientModInitializer;

public class WriteAMinecraftPaper1Mod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        try {
        // Intentionally minimal no-op initializer.
        // This file contains no risky cross-version API usage and is kept minimal to ensure compilation
        // against the requested Minecraft/Fabric environment.
    
        } catch (Throwable __modforge_t) {
            System.err.println("ModForge: onInitialize failed: " + __modforge_t);
            __modforge_t.printStackTrace();
        }
    }
}
