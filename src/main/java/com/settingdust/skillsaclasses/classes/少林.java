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
public class 少林 extends RPGClass {
    public 少林() {
        super("少林",
                new ItemStack(Material.BOWL),
                60);
        this.setManaName("气力");
        this.settings.set(ClassAttribute.HEALTH, 1500, 37);
        this.settings.set(ClassAttribute.MANA, 350, 12);
        this.setPrefix(ChatColor.BOLD + "" + ChatColor.YELLOW + "[少林]");
    }
}
