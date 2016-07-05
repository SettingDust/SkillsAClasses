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
public class 武当 extends RPGClass{
    public 武当() {
        super("武当",
                new ItemStack(Material.CHAINMAIL_CHESTPLATE),
                60);
        this.setManaName("内力");
        this.settings.set(ClassAttribute.HEALTH, 1100, 19);
        this.settings.set(ClassAttribute.MANA, 500, 17);
        this.setPrefix(ChatColor.BOLD + "" + ChatColor.GRAY + "[武当]");
    }
}
