package com.JiksPlug;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;

@Slf4j
@PluginDescriptor(
		name = "Jiks Plug",
		description = "Jiks companion plugin, More immersive clan system, companion to Sir Jik Li discord bot",
		tags = {"clan", "jik", "sir jik li", "winter"}
)
public class JiksPlugPlugin extends Plugin
{
	@Inject
	private JiksPlugConfig config;

	@Inject
	private Transmog transmog;

	@Inject
	private EventBus eventBus;

	@Override
	protected void startUp() throws Exception
	{
		// Initialize the plugin and register relevant events based on the config settings
		if (config.transmog())
		{
			transmog.startUp();
			eventBus.register(transmog);
		}
		/*
		if (config.showOngoingEvents())
		{
			// Register events for showing ongoing events and announcements
		}

		if (config.taskmaster())
		{
			// Register taskmaster events
		}
		*/
	}

	@Override
	protected void shutDown() throws Exception
	{
		// Clean up resources
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		/*
		if (config.sendDataToBot())
		{
			// Logic to send data to the Discord bot
		}

		if (config.getDataFromBot())
		{
			// Logic to fetch data from the Discord bot
		}

		// Other periodic tasks

		 */
	}

}
