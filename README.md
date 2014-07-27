Minecraft-ClassTrap
===================

ClassTrap for Bukkit API

http://forums.bukkit.org/threads/util-lib-classtrap-an-polite-reflection-library-interface-classes-in-a-completely-new-way.295710/

This branch includes interfaces for all NMS / CB classes so that you can easily call their methods without having to create your own.

However to save space you most likely need to delete interfaces that you are not using!


GETTERS / SETTERS are not currently implemented for any classes so if you need access to private fields you will need to create your own method in the interface and tag it with a TrapTag annotation.
