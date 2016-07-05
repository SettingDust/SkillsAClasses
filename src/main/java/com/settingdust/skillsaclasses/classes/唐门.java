package com.settingdust.skillsaclasses.classes;

import com.sucy.skill.api.classes.ClassAttribute;
import com.sucy.skill.api.classes.RPGClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Author: SettingDust
 * Date: 16-7-5
 * By IntelliJ IDEA
 */
public class 唐门 extends RPGClass{
    public 唐门() {
        super("唐门",
                new ItemStack(Material.COCOA),
                60);
        this.setManaName("精力");
        this.settings.set(ClassAttribute.HEALTH, 1250, 30);
        this.settings.set(ClassAttribute.MANA, 400, 15);
        this.setPrefix(ChatColor.BOLD + "" + ChatColor.LIGHT_PURPLE + "[唐门]");
    }
}
