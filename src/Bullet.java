import java.util.Random;

/**
 * 类的描述：子弹类
 *
 * @author wentao
 * @time Create in 14:28 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public class Bullet extends FlyingObject {
    private int speed=1; //定义子弹速度

    public Bullet(int x,int y){
        image=ShootGame.bullet;
        width=image.getWidth();
        height=image.getHeight();
        this.x=x; //根据英雄机坐标来获取位置
        this.y=y; //根据英雄机坐标来获取位置
    }

    /**重写移动方法
     * @author wentao
     * @time Create in
     */
    public void step() {
        y-=speed;
    }

    /**重写越界方法
     * @author wentao
     * @time Create in
     */
    public boolean outOfBounds(){
        return this.y<=-ShootGame.HEIGHT; //子弹超过窗口
    }
}
