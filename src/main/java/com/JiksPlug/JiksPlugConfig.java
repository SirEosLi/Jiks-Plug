package com.JiksPlug;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("JCH")
public interface JiksPlugConfig extends Config
{
	@ConfigItem(
			keyName = "sendDataToBot",
			name = "Send Data to Bot",
			description = "Enable sending data to the Discord bot",
			position = 1
	)
	default boolean sendDataToBot()
	{
		return true;
	}

	@ConfigItem(
			keyName = "getDataFromBot",
			name = "Get Data from Bot",
			description = "Enable fetching data from the Discord bot",
			position = 2
	)
	default boolean getDataFromBot()
	{
		return true;
	}

	@ConfigItem(
			keyName = "transmog",
			name = "Transmog",
			description = "Enable transmog feature",
			position = 3
	)
	default boolean transmog()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showOngoingEvents",
			name = "Show Ongoing Events",
			description = "Enable showing ongoing events and announcements",
			position = 4
	)
	default boolean showOngoingEvents()
	{
		return true;
	}

	@ConfigItem(
			keyName = "taskmaster",
			name = "Taskmaster",
			description = "Enable taskmaster plugin",
			position = 5
	)
	default boolean taskmaster()
	{
		return true;
	}
}
