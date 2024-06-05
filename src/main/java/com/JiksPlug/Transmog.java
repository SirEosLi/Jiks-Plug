package com.JiksPlug;

import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.ItemID;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;

import javax.inject.Inject;

public class Transmog
{
    private static final int OVERRIDE_HELMET_ID = ItemID.IRON_FULL_HELM; // Example: Iron Full Helm

    private final Client client;

    @Inject
    public Transmog(Client client)
    {
        this.client = client;
    }

    public void startUp()
    {
        // Initialize any resources if needed
    }

    public void shutDown()
    {
        // Clean up any resources if needed
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        Player localPlayer = client.getLocalPlayer();
        if (localPlayer != null && localPlayer.getPlayerComposition() != null)
        {
            int[] equipmentIds = localPlayer.getPlayerComposition().getEquipmentIds();
            overrideHelmet(equipmentIds);
            localPlayer.getPlayerComposition().setHash();
        }
    }

    private void overrideHelmet(int[] equipmentIds)
    {
        // EquipmentInventorySlot.HEAD.getSlotIdx() gets the index for the helmet slot
        int helmetSlotIdx = EquipmentInventorySlot.HEAD.getSlotIdx();
        equipmentIds[helmetSlotIdx] = OVERRIDE_HELMET_ID;
    }
}