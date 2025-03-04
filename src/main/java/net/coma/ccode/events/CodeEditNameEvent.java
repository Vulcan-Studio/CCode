package net.coma.ccode.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter
public class CodeEditNameEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final String name;
    private final String newName;

    public CodeEditNameEvent(@NotNull final String name, @NotNull final String newName) {
        this.name = name;
        this.newName = newName;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
