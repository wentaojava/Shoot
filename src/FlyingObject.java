import java.awt.image.BufferedImage;
/**飞行物
 * @author wentao
 * @time Create in 13:48 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public abstract class FlyingObject {
    protected BufferedImage image;
    protected int width;
    protected int height;
    protected int x,y;
    public abstract void step();
    public abstract boolean outOfBounds(); //检查是否越界

    /**检查敌机是否与子弹相撞**/
    public boolean shootBy(Bullet bullet){
        int x1=this.x;
        int y1=this.y;
        int x2=this.x+this.width;
        int y2=this.y+this.height;
        int x=bullet.x,y=bullet.y;
        return x>=x1 && x<=x2 && y<=y2 && y>=y1;
    }
}
