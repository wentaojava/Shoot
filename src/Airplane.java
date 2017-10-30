import java.util.Random;
/**
 * 类的描述：敌机类
 *
 * @author wentao
 * @time Create in 14:19 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public class Airplane extends FlyingObject implements Enemy{
    private int speed=1; //控制敌机下落速度

    public Airplane(){
        image=ShootGame.airplane;
        width=image.getWidth();
        height=image.getHeight();
        Random rand=new Random();
        x=rand.nextInt(ShootGame.WIDTH-this.width);
        y= -this.height;

    }

    /**重写得分
     * @author wentao
     * @time Create in  
     */
    public int getScore(){
        return 5; //一个返回5分
    }

    @Override
    /**重写移动方法
     * @author wentao
     * @time Create in
     */
    public void step() {
        y+=speed;
    }

    /**重写越界方法
     * @author wentao
     * @time Create in
     */
    public boolean outOfBounds(){
        return this.y>=ShootGame.HEIGHT; //敌机超过窗口
    }
}
