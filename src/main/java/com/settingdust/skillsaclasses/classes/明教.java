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
public class 明教 extends RPGClass {
    public 明教() {
        super("明教",
                new ItemStack(Material.IRON_SWORD),
                60);
        this.setManaName("体力");
        this.settings.set(ClassAttribute.HEALTH, 1000, 26);
        this.settings.set(ClassAttribute.MANA, 300, 11);
        this.setPrefix(ChatColor.BOLD + "" + ChatColor.BLUE + "[明教]");
    }
}
