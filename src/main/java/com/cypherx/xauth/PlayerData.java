/*
 * xAuth for Bukkit
 * Copyright (C) 2012 Lycano <https://github.com/lycano/xAuth/>
 *
 * Copyright (C) 2011 CypherX <https://github.com/CypherX/xAuth/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cypherx.xauth;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import java.util.Collection;

public class PlayerData {
    private ItemStack[] items = null;
    private ItemStack[] armor = null;
    private Location location = null;
    private Collection<PotionEffect> potEffects;
    private int fireTicks;
    private int remainingAir;

    public PlayerData(ItemStack[] items, ItemStack[] armor, Location location, Collection<PotionEffect> potEffects, int fireTicks, int remainingAir) {
        this.items = items;
        this.armor = armor;
        this.location = location;
        this.potEffects = potEffects;
        this.fireTicks = fireTicks;
        this.remainingAir = remainingAir;
    }

    public ItemStack[] getItems() {
        return items;
    }

    public ItemStack[] getArmor() {
        return armor;
    }

    public Location getLocation() {
        return location;
    }

    public Collection<PotionEffect> getPotionEffects() {
        return potEffects;
    }

    public int getFireTicks() {
        return fireTicks;
    }

    public int getRemainingAir() {
        return remainingAir;
    }
}