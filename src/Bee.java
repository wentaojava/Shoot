import java.util.Random;

/**
 * 类的描述：小蜜蜂类
 * @author wentao
 * @time Create in 14:25 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public class Bee extends FlyingObject implements Award {
    private int xSpeed=1; //定义X坐标移动速度
    private int ySpeed=1; //定义Y坐标移动速度
    private int awardType; //定义奖励类型

    public Bee(){
        image=ShootGame.bee;
        width=image.getWidth();
        height=image.getHeight();
        Random rand=new Random();
        x=rand.nextInt(ShootGame.WIDTH-this.width);
        y= -this.height;
        awardType=rand.nextInt(2);

    }
    /**重写奖励类型
     * @author wentao
     * @time Create in
     */
    public int getType(){
        return awardType;
    }

    /**重写移动方法
     * @author wentao
     * @time Create in
     */
    public void step() {
        x+=xSpeed;
        y+=ySpeed;
        if(x>=ShootGame.WIDTH-this.width){
            xSpeed=-1;
        }
        if(x<=0){
            xSpeed=1;
        }
    }

    /**重写越界方法
     * @author wentao
     * @time Create in
     */
    public boolean outOfBounds(){
        return this.y>=ShootGame.HEIGHT; //小蜜蜂超过窗口
    }
}
