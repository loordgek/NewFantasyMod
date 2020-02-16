package mod.dragonita.fantasymod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.dragonita.fantasymod.entities.UnicornEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

/**
 * ModelUnicornTabula - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelUnicorn extends EntityModel<UnicornEntity> {
    public ModelRenderer Body;
    public ModelRenderer NeckHair;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer LeftChest;
    public ModelRenderer RightChest;
    public ModelRenderer Tail1;
    public ModelRenderer Head;
    public ModelRenderer RightEar1;
    public ModelRenderer LeftEar1;
    public ModelRenderer Neck;
    public ModelRenderer LeftMouthSaddleLine;
    public ModelRenderer RightMouthSaddleLine;
    public ModelRenderer CenterSaddle;
    public ModelRenderer RightSaddleMouthButton;
    public ModelRenderer LeftSaddleMouthButton;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftLeg3;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightLeg3;
    public ModelRenderer FrontRightLeg2;
    public ModelRenderer FrontRightLeg3;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontLeftLeg3;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer UpperMouth;
    public ModelRenderer UnderMouth;
    public ModelRenderer Corn1;
    public ModelRenderer Corn2;
    public ModelRenderer Corn3;
    public ModelRenderer RightEar2;
    public ModelRenderer LeftEar2;
    public ModelRenderer BackUpperSaddlePart;
    public ModelRenderer FrontUpperSaddlePart;
    public ModelRenderer LeftSaddleLine;
    public ModelRenderer RightSaddleLine;
    public ModelRenderer LeftSaddlePart;
    public ModelRenderer RightSaddlePart;

    public ModelUnicorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Body = new ModelRenderer(this, 0, 34);
        this.Body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.Body.func_228301_a_(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.LeftEar2 = new ModelRenderer(this, 0, 80);
        this.LeftEar2.setRotationPoint(0.0F, -0.2F, -0.1F);
        this.LeftEar2.func_228301_a_(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LeftEar2, 0.0F, -0.13962634015954636F, -0.20943951023931953F);
        this.UpperMouth = new ModelRenderer(this, 24, 14);
        this.UpperMouth.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.UpperMouth.func_228301_a_(-2.0F, -10.0F, -8.0F, 4, 3, 7, 0.0F);
        this.RightEar2 = new ModelRenderer(this, 0, 0);
        this.RightEar2.setRotationPoint(0.0F, -0.2F, -0.1F);
        this.RightEar2.func_228301_a_(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(RightEar2, 0.0F, 0.13962634015954636F, 0.20943951023931953F);
        this.NeckHair = new ModelRenderer(this, 59, 0);
        this.NeckHair.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.NeckHair.func_228301_a_(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(NeckHair, 0.5235987755982988F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 44, 0);
        this.Tail1.setRotationPoint(0.0F, -8.0F, 5.0F);
        this.Tail1.func_228301_a_(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail1, -1.3089969389957472F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -6.2F, -20.0F);
        this.Head.func_228301_a_(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Head, 0.5235987755982988F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 39, 7);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail2.func_228301_a_(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.RightSaddleLine = new ModelRenderer(this, 81, 0);
        this.RightSaddleLine.setRotationPoint(-5.0F, 0.2F, 0.0F);
        this.RightSaddleLine.func_228301_a_(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.CenterSaddle = new ModelRenderer(this, 80, 0);
        this.CenterSaddle.setRotationPoint(0.0F, -9.0F, -7.0F);
        this.CenterSaddle.func_228301_a_(-5.0F, 0.0F, -3.0F, 10, 1, 8, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 60, 29);
        this.FrontRightLeg1.setRotationPoint(-4.0F, -2.0F, -17.0F);
        this.FrontRightLeg1.func_228301_a_(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 12);
        this.Neck.setRotationPoint(0.0F, -6.5F, -19.0F);
        this.Neck.func_228301_a_(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(Neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.FrontUpperSaddlePart = new ModelRenderer(this, 106, 9);
        this.FrontUpperSaddlePart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontUpperSaddlePart.func_228301_a_(-1.5F, -1.0F, -3.0F, 3, 1, 2, 0.0F);
        this.UnderMouth = new ModelRenderer(this, 24, 24);
        this.UnderMouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UnderMouth.func_228301_a_(-2.0F, -7.0F, -8.0F, 4, 2, 7, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 78, 29);
        this.BackLeftLeg1.setRotationPoint(4.0F, -2.0F, 2.0F);
        this.BackLeftLeg1.func_228301_a_(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.RightMouthSaddleLine = new ModelRenderer(this, 61, 5);
        this.RightMouthSaddleLine.setRotationPoint(0.0F, -7.0F, -19.0F);
        this.RightMouthSaddleLine.func_228301_a_(-2.6F, -6.0F, -6.0F, 0, 3, 16, 0.0F);
        this.Corn2 = new ModelRenderer(this, 15, 70);
        this.Corn2.setRotationPoint(0.5F, -2.0F, 0.5F);
        this.Corn2.func_228301_a_(0.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.BackLeftLeg3 = new ModelRenderer(this, 78, 51);
        this.BackLeftLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackLeftLeg3.func_228301_a_(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.Corn1 = new ModelRenderer(this, 0, 70);
        this.Corn1.setRotationPoint(-1.5F, -11.0F, -5.5F);
        this.Corn1.func_228301_a_(0.0F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
        this.LeftSaddlePart = new ModelRenderer(this, 75, 0);
        this.LeftSaddlePart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSaddlePart.func_228301_a_(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
        this.LeftMouthSaddleLine = new ModelRenderer(this, 61, 5);
        this.LeftMouthSaddleLine.setRotationPoint(0.0F, -7.0F, -19.0F);
        this.LeftMouthSaddleLine.func_228301_a_(2.6F, -6.0F, -6.0F, 0, 3, 16, 0.0F);
        this.Tail3 = new ModelRenderer(this, 24, 3);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.func_228301_a_(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tail3, -0.2617993877991494F, 0.0F, 0.0F);
        this.LeftChest = new ModelRenderer(this, 0, 47);
        this.LeftChest.setRotationPoint(8.0F, -8.0F, -1.0F);
        this.LeftChest.func_228301_a_(-3.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
        this.setRotateAngle(LeftChest, 0.0F, -1.5707963267948966F, 0.0F);
        this.RightChest = new ModelRenderer(this, 0, 34);
        this.RightChest.setRotationPoint(-8.0F, -8.0F, 1.0F);
        this.RightChest.func_228301_a_(-3.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
        this.setRotateAngle(RightChest, -0.0F, 1.5707963267948966F, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 96, 29);
        this.BackRightLeg1.setRotationPoint(-4.0F, -2.0F, 2.0F);
        this.BackRightLeg1.func_228301_a_(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 96, 43);
        this.BackRightLeg2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.BackRightLeg2.func_228301_a_(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.RightSaddleMouthButton = new ModelRenderer(this, 74, 13);
        this.RightSaddleMouthButton.setRotationPoint(-0.2F, -7.0F, -18.5F);
        this.RightSaddleMouthButton.func_228301_a_(-2.5F, -8.0F, -4.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RightSaddleMouthButton, 0.5235987755982988F, 0.0F, 0.0F);
        this.BackRightLeg3 = new ModelRenderer(this, 96, 51);
        this.BackRightLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackRightLeg3.func_228301_a_(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.LeftSaddleLine = new ModelRenderer(this, 71, 0);
        this.LeftSaddleLine.setRotationPoint(5.0F, 0.2F, 0.0F);
        this.LeftSaddleLine.func_228301_a_(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 46, 29);
        this.FrontLeftLeg1.setRotationPoint(4.0F, -2.0F, -17.0F);
        this.FrontLeftLeg1.func_228301_a_(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 78, 43);
        this.BackLeftLeg2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.BackLeftLeg2.func_228301_a_(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 60, 41);
        this.FrontRightLeg2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.FrontRightLeg2.func_228301_a_(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.FrontLeftLeg3 = new ModelRenderer(this, 44, 51);
        this.FrontLeftLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontLeftLeg3.func_228301_a_(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.BackUpperSaddlePart = new ModelRenderer(this, 80, 9);
        this.BackUpperSaddlePart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackUpperSaddlePart.func_228301_a_(-4.0F, -1.0F, 3.0F, 8, 1, 2, 0.0F);
        this.LeftEar1 = new ModelRenderer(this, 10, 80);
        this.LeftEar1.setRotationPoint(0.0F, -7.0F, -19.0F);
        this.LeftEar1.func_228301_a_(-2.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(LeftEar1, 0.5235987755982988F, 0.0F, 0.2617993877991494F);
        this.Corn3 = new ModelRenderer(this, 30, 70);
        this.Corn3.setRotationPoint(0.5F, -2.0F, 0.5F);
        this.Corn3.func_228301_a_(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LeftSaddleMouthButton = new ModelRenderer(this, 74, 13);
        this.LeftSaddleMouthButton.setRotationPoint(0.2F, -7.0F, -18.5F);
        this.LeftSaddleMouthButton.func_228301_a_(1.5F, -8.0F, -4.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftSaddleMouthButton, 0.5235987755982988F, 0.0F, 0.0F);
        this.FrontRightLeg3 = new ModelRenderer(this, 60, 51);
        this.FrontRightLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontRightLeg3.func_228301_a_(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.RightEar1 = new ModelRenderer(this, 0, 12);
        this.RightEar1.setRotationPoint(0.0F, -7.0F, -19.0F);
        this.RightEar1.func_228301_a_(0.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(RightEar1, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 44, 41);
        this.FrontLeftLeg2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.FrontLeftLeg2.func_228301_a_(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.RightSaddlePart = new ModelRenderer(this, 75, 4);
        this.RightSaddlePart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightSaddlePart.func_228301_a_(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
        this.LeftEar1.addChild(this.LeftEar2);
        this.Head.addChild(this.UpperMouth);
        this.RightEar1.addChild(this.RightEar2);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.Head);
        this.Tail1.addChild(this.Tail2);
        this.CenterSaddle.addChild(this.RightSaddleLine);
        this.Body.addChild(this.CenterSaddle);
        this.Body.addChild(this.FrontRightLeg1);
        this.Body.addChild(this.Neck);
        this.CenterSaddle.addChild(this.FrontUpperSaddlePart);
        this.Head.addChild(this.UnderMouth);
        this.Body.addChild(this.BackLeftLeg1);
        this.Body.addChild(this.RightMouthSaddleLine);
        this.Corn1.addChild(this.Corn2);
        this.BackLeftLeg2.addChild(this.BackLeftLeg3);
        this.UpperMouth.addChild(this.Corn1);
        this.LeftSaddleLine.addChild(this.LeftSaddlePart);
        this.Body.addChild(this.LeftMouthSaddleLine);
        this.Tail2.addChild(this.Tail3);
        this.Body.addChild(this.LeftChest);
        this.Body.addChild(this.RightChest);
        this.Body.addChild(this.BackRightLeg1);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.Body.addChild(this.RightSaddleMouthButton);
        this.BackRightLeg2.addChild(this.BackRightLeg3);
        this.CenterSaddle.addChild(this.LeftSaddleLine);
        this.Body.addChild(this.FrontLeftLeg1);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.FrontLeftLeg2.addChild(this.FrontLeftLeg3);
        this.CenterSaddle.addChild(this.BackUpperSaddlePart);
        this.Body.addChild(this.LeftEar1);
        this.Corn2.addChild(this.Corn3);
        this.Body.addChild(this.LeftSaddleMouthButton);
        this.FrontRightLeg2.addChild(this.FrontRightLeg3);
        this.Body.addChild(this.RightEar1);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.RightSaddleLine.addChild(this.RightSaddlePart);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

	@Override
	public void func_225598_a_(MatrixStack arg0, IVertexBuilder arg1, int arg2, int arg3, float arg4, float arg5,
			float arg6, float arg7) {
		
	}

	@Override
	public void func_225597_a_(UnicornEntity arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.Body.func_228300_a_(arg1, arg2, arg3, arg4, arg5, arg5);
		this.NeckHair.func_228300_a_(arg1, arg2, arg3, arg4, arg5, arg5);
		//this.Body.func(arg1, arg2, arg3, arg4, arg5);
	}
}
