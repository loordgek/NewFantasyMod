package mod.dragonita.fantasymod.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PCEntityModel<entity extends Entity> extends EntityModel<entity>

{

	/**

	 * An array containing all the body parts of the model

	 */

	protected PCRenderModel[] bodyParts;

	private float movementScale = 1.0F;

	

	/**

	 * Saves all needed information for both the loop animation system and the keyframe system

	 */

	public void saveAllDefaultValues()

	{

		saveDefaultBoxValues();

		saveAsDefaultPose();

	}

	

	/**

	 * Loads all needed information for both the loop animation system and the keyframe system

	 */

	public void loadAllDefaultValues()

	{

		loadDefaultBoxValues();

		loadDefaultPose();

	}

	

	/**

	 * This will go through all body parts saved in the bodyParts array, and then save their information (rotation point. rotation angle, offset) as the default options

	 */

	public void saveDefaultBoxValues()

	{

		for(PCRenderModel bodyPart : bodyParts)

        {

        	bodyPart.saveDefaultBoxValues();

        }

	}

	

	/**

     * This will go through all body parts saved in the bodyParts array, and then load their information (rotation point. rotation angle, offset) from the default options

     */

	public void loadDefaultBoxValues()

	{

		for(PCRenderModel bodyPart : bodyParts)

        {

        	bodyPart.loadDefaultBoxValues();

        }

	}

	

	/**

	 * This will go through all body parts saved in the bodyParts array, and then save their information (position. rotation, offset) as the default options

	 */

    public void saveAsDefaultPose()

    {

        for(PCRenderModel bodyPart : bodyParts)

        {

        	bodyPart.saveAsDefaultPose();

        }

    }



    /**

     * This will go through all body parts saved in the bodyParts array, and then load their information (position. rotation, offset) from the default options

     */

    public void loadDefaultPose()

    {

    	for(PCRenderModel bodyPart : bodyParts)

        {

    		bodyPart.loadDefaultPose();

        }

    }



    /**

     * @return the movement scale of this Model

     */

    public float getMovementScale()

    {

        return this.movementScale;

    }



    /**

     * Multiplies all rotation and position changes by this value

     */

    public void setMovementScale(float movementScale)

    {

        this.movementScale = movementScale;

    }

    
    @Override
    public void setRotationAngles(entity arg0, float arg1, float arg2, float arg3, float arg4, float arg5)
    {
		this.setRotationAngles(arg0, arg1, arg2, arg3, arg4, arg5);
	}

    //##########################################################################################################################################

    //##########################################################################################################################################

    //##########################################################################################################################################

    

    /**

     * Rotates this box back and forth (rotateAngleX)

     */

    public void swing(PCRenderModel box, float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)

    {

        box.swing(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);

    }



    /**

     * Rotates this box right and left (rotateAngleZ)

     */

    public void flap(PCRenderModel box, float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)

    {

        box.flap(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);

    }



    /**

     * Rotates this box side to side (rotateAngleY)

     */

    public void shake(PCRenderModel box, float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)

    {

        box.shake(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);

    }



    /**

     * This makes the given Box move Up and Down on the Y Axis

     */

    public void bounce(PCRenderModel box, float speed, float height, boolean extraBouncy, float limbSwing, float limbSwingAmount)

    {

        box.bounce(speed, height, extraBouncy, limbSwing, limbSwingAmount);

    }


	@Override
	public void render(MatrixStack arg0, IVertexBuilder arg1, int arg2, int arg3, float arg4, float arg5, float arg6,
			float arg7) {
		// TODO Auto-generated method stub
		
	}

}