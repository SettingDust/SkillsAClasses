package com.settingdust.skillsaclasses.skills;

import com.sucy.skill.api.skills.Skill;
import org.bukkit.Material;

/**
 * Author: SettingDust
 * Date: 16-7-5
 * By IntelliJ IDEA
 */
public class BaseSkill extends Skill {

    public BaseSkill() {
        super("base", "damage", Material.BOOK, 5);
    }
}
