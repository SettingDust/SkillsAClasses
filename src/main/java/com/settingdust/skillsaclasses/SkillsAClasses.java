package com.settingdust.skillsaclasses;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Author: SettingDust
 * Date: 16-7-5
 * By IntelliJ IDEA
 */
public class SkillsAClasses extends JavaPlugin implements SkillPlugin {
    public void onEnable() {
        this.getLogger().info("本插件由SettingDust编写");
        this.getLogger().info("邮箱:settingdust@gmail.com");
    }

    public void registerSkills(SkillAPI skillAPI) {

    }

    public void registerClasses(SkillAPI skillAPI) {

    }
}
