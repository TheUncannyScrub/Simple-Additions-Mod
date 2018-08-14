package com.theuncannyscrub.minecraftadditions;

import com.theuncannyscrub.minecraftadditions.init.ModRecipes;
import com.theuncannyscrub.minecraftadditions.proxy.CommonProxy;
import com.theuncannyscrub.minecraftadditions.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.Console;

import java.util.Random;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs MATAB = new MinecraftAdditionsTab("MinecraftAdditionsTab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		Console.println("[Minecraft Additions] -> PreInitialization Event");
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		Console.println("[Minecraft Additions] -> Initialization Event");
		ModRecipes.init();
		Console.println("[Minecraft Additions] -> Loaded Mod Recipes");
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		Random rand = new Random();
		int n = rand.nextInt(20)+1;
		if(n > 10) {
			Console.println("HELPPPP Im stuck inside of minecraft.. PLEASE SEND HELP");
		}
		Console.println("[Minecraft Additions] -> PostInitialization Event");
	}


}
