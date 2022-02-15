package com.example;

import net.minecraft.util.EnumChatFormatting;
import org.utilityclient.overlay.ITheme;

public class ExampleTheme implements ITheme {
    @Override
    public String getName() {
        return "Example Theme";
    }

    @Override
    public EnumChatFormatting getPrefixColor() {
        return EnumChatFormatting.DARK_AQUA;
    }

    @Override
    public EnumChatFormatting getSuffixColor() {
        return EnumChatFormatting.RED;
    }

    // The Separator and the Font Renderer can be replaced if required.
    // To replace them, implement/override #getSeparator() and #getFontRenderer().
}
