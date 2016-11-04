package com.project.zero;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Main{

    public static final String MODID = "base";
    public static final String MODNAME = "Thrisk Base";
    public static final String VERSION = "1.1.0";
    
    @SidedProxy(clientSide="com.thrisk.base.ClientProxy", serverSide="com.thrisk.base.ServerProxy")
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