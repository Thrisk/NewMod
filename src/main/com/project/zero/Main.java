package com.project.zero;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "project";
    public static final String MODNAME = "zero";
    public static final String VERSION = "1.1.0";
    
    @SidedProxy(clientSide="com.project.zero.ClientProxy", serverSide="com.project.zero.ServerProxy")
    public static CommonProxy proxy;
        
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler		
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
                
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
                
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
                
    }
}	