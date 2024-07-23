package net.coma.ccode.version.nms.v1_21_R1;

import net.coma.ccode.utils.CodeLogger;
import net.coma.ccode.version.ServerVersionSupport;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Version implements ServerVersionSupport {

    @Contract(pure = true)
    public Version(@NotNull Plugin plugin) {
        CodeLogger.info("Loading support for version 1.21...");
        CodeLogger.info("Support for 1.21 is loaded!");
    }

    @Override
    public String getName() {
        return "1.21_R1";
    }

    @Override
    public boolean isSupported() {
        return true;
    }
}
