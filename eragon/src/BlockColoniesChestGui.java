package colonies.eragon.src;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.StatCollector;

import org.lwjgl.opengl.GL11;

import colonies.src.TileEntityColoniesChest;
 
 
public class BlockColoniesChestGui extends GuiContainer{
        public BlockColoniesChestGui(InventoryPlayer player_inventory,TileEntityColoniesChest tile_entity){
                super(new ContainerColoniesChest(tile_entity, player_inventory));
        }
       
       
        @Override
        protected void drawGuiContainerForegroundLayer(int i, int j){
       
                fontRenderer.drawString("Colonies Chest Gui", 6, 6, 0xffffff);
                fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 6, ySize - 96 , 0xffffff);
        }
       
       
        @Override
        protected void drawGuiContainerBackgroundLayer(float f, int i, int j){
       
                int picture = mc.renderEngine.getTexture("/colonies/anglewyrm/gfx/container.png");
               
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
               
                this.mc.renderEngine.bindTexture(picture);
               
                int x = (width - xSize) / 2;
               
                int y = (height - ySize) / 2;
               
                this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        }
}