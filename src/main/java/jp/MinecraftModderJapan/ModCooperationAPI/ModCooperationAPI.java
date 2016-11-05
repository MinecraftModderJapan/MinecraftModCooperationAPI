package jp.MinecraftModderJapan.ModCooperationAPI;

import jp.MinecraftModderJapan.ModCooperationAPI.api.entity.IBreedable;
import jp.MinecraftModderJapan.ModCooperationAPI.api.entity.IRidden;
import jp.MinecraftModderJapan.ModCooperationAPI.api.item.IBook;
import jp.MinecraftModderJapan.ModCooperationAPI.api.item.IFood;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.lang3.NotImplementedException;

import java.util.concurrent.Callable;

@Mod(modid = ModCooperationAPI.MOD_ID)
public class ModCooperationAPI{
    public static final String MOD_ID = "jp.MinecraftModderJapan.ModCooperationAPI";

    @EventHandler
    private void preInit(FMLPreInitializationEvent event){
        registerCaps();
    }

    private void registerCaps(){
        registerCap(IBook.class);
        registerCap(IFood.class);
        registerCap(IBreedable.class);
        registerCap(IRidden.class);
    }

    private <T> void registerCap(Class<T> clazz){
        CapabilityManager.INSTANCE.register(clazz, new Capability.IStorage<T>(){
            @Override
            public NBTBase writeNBT(Capability<T> capability, T instance, EnumFacing side){
                throw new NotImplementedException("No default implementation");
            }

            @Override
            public void readNBT(Capability<T> capability, T instance, EnumFacing side, NBTBase nbt){
                throw new NotImplementedException("No default implementation");
            }
        }, new Callable<T>(){
            @Override
            public T call() throws Exception{
                throw new NotImplementedException("No default implementation");
            }
        });
    }
}