package com.settingdust.skillsaclasses.classes;

import com.sucy.skill.api.classes.RPGClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Author: SettingDust
 * Date: 16-7-5
 * By IntelliJ IDEA
 */
public class BaseClass extends RPGClass{
    protected BaseClass() {
        super("name",
                new ItemStack(Material.BOOK),
                10,
                "group",
                "parent");
    }
}
