package com.JiksPlug;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class JiksPlugPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(JiksPlug.class);
		RuneLite.main(args);
	}
}