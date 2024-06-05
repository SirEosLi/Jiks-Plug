package com.JiksPlug;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class JCHPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(JiksPlugPlugin.class);
		RuneLite.main(args);
	}
}