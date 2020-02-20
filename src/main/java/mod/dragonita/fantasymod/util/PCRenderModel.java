package mod.dragonita.fantasymod.util;

import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PCRenderModel extends ModelRenderer{
	
	public PCRenderModel(Model p_i46358_1_, int p_i46358_2_, int p_i46358_3_) {
		super(p_i46358_1_, p_i46358_2_, p_i46358_3_);
	}



	//Used for Keyframe Animations
	private float defaultRotationPointX, defaultRotationPointY, defaultRotationPointZ;
	private float defaultRotateAngleX, defaultRotateAngleY, defaultRotateAngleZ;
	//private float defaultOffsetX, defaultOffsetY, defaultOffsetZ;


	//Used for Looped Animations
	private float defaultRotationX, defaultRotationY, defaultRotationZ;
	//private float defaultdelayX, defaultdelayY, defaultdelayZ;
	private float defaultPositionX, defaultPositionY, defaultPositionZ;

	

    /**

     * Sets this thisRenderer's default box values to the current box values.

     */

    public void saveDefaultBoxValues()
    {
		this.defaultRotationPointX = this.rotationPointX;
		this.defaultRotationPointY = this.rotationPointY;
		this.defaultRotationPointZ = this.rotationPointZ;
		

		this.defaultRotateAngleX = this.rotateAngleX;
		this.defaultRotateAngleY = this.rotateAngleY;
		this.defaultRotateAngleZ = this.rotateAngleZ;

		
		/*
		this.defaultOffsetX = this.offsetX;
		this.defaultOffsetY = this.offsetY;
		this.defaultOffsetZ = this.offsetZ;
		*/
	}

	

    /**

     * Sets the current box values to the previously set box values.

     */

	public void loadDefaultBoxValues()
	{
		this.rotationPointX = this.defaultRotationPointX;
		this.rotationPointY = this.defaultRotationPointY;
		this.rotationPointZ = this.defaultRotationPointZ;
		

		this.rotateAngleX = this.defaultRotateAngleX;
		this.rotateAngleY = this.defaultRotateAngleY;
		this.rotateAngleZ = this.defaultRotateAngleZ;
		
		/*
		this.offsetX = this.defaultOffsetX;
		this.offsetY = this.defaultOffsetY;
		this.offsetZ = this.defaultOffsetZ;
		*/
	}

    /**
     * Sets this thisRenderer's default pose to the current pose.
     */

    public void saveAsDefaultPose()
    {
        this.defaultRotationX = this.rotateAngleX;
        this.defaultRotationY = this.rotateAngleY;
        this.defaultRotationZ = this.rotateAngleZ;

        /*
        this.defaultdelayX = this.offsetX;
        this.defaultdelayY = this.offsetY;
        this.defaultdelayZ = this.offsetZ;
		*/

        this.defaultPositionX = this.rotationPointX;
        this.defaultPositionY = this.rotationPointY;
        this.defaultPositionZ = this.rotationPointZ;
    }



    /**

     * Sets the current pose to the previously set default pose.

     */

    public void loadDefaultPose()
    {
        this.rotateAngleX = this.defaultRotationX;
        this.rotateAngleY = this.defaultRotationY;
        this.rotateAngleZ = this.defaultRotationZ;
        
        /*
        this.offsetX = this.defaultdelayX;
        this.offsetY = this.defaultdelayY;
        this.offsetZ = this.defaultdelayZ;
		*/

        this.rotationPointX = this.defaultPositionX;
        this.rotationPointY = this.defaultPositionY;
        this.rotationPointZ = this.defaultPositionZ;

    }
    
    private float calculateRotation(float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)
    {
        float movementScale = 1.0F;
        if(invert == true)
        {
        	float rotation = (MathHelper.cos(limbSwing * (speed * movementScale) + delay) * (degree * movementScale) * limbSwingAmount) - (weight * limbSwingAmount);
        	return -rotation;
        }
        else
        {
        	float rotation = (MathHelper.cos(limbSwing * (speed * movementScale) + delay) * (degree * movementScale) * limbSwingAmount) + (weight * limbSwingAmount);
        	return rotation;
        }
    }

    /**

     * Rotates this box back and forth (rotateAngleX)

     */

    public void swing(float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)
    {
    	this.rotateAngleX += this.calculateRotation(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);
    }



    /**

     * Rotates this box right and left (rotateAngleZ)

     */

    public void flap(float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)

    {

    	this.rotateAngleZ += this.calculateRotation(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);

    }



    /**

     * Rotates this box side to side (rotateAngleY)

     */

    public void shake(float speed, float degree, boolean invert, float delay, float weight, float limbSwing, float limbSwingAmount)
    {
    	this.rotationPointY += this.calculateRotation(speed, degree, invert, delay, weight, limbSwing, limbSwingAmount);
    }



    /**

     * This makes the given Box move Up and Down on the Y Axis

     */

    public void bounce(float speed, float height, boolean extraBouncy, float limbSwing, float limbSwingAmount)

    {

        float movementScale = 1.0F;

        height *= movementScale;

        speed *= movementScale;

        float bounce = (float) (Math.sin(limbSwing * speed) * limbSwingAmount * height - limbSwingAmount * height);

        if(extraBouncy == true)

        {

        	bounce = (float) -Math.abs((Math.sin(limbSwing * speed) * limbSwingAmount * height));

        }

        this.rotationPointY += bounce;

    }
    
}
