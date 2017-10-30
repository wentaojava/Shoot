import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 类的描述：英雄机类
 *
 * @author wentao
 * @time Create in 14:29 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public class Hero extends FlyingObject {
    private int doubleFire;  //定义火力
    private int life; //定义命
    private BufferedImage[] images; //定义图片数组
    private int index; //协助图片切换

    public Hero(){
        image=ShootGame.hero0;
        width=image.getWidth();
        height=image.getHeight();
        x=150;
        y=400;
        this.doubleFire=0;
        this.life=3;
        images=new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
        index=0;
    }

    public void step() {
        image=images[(index++)/10%images.length];
    }

    /**发射子弹
     * @author wentao
     * @time Create in
     */
    public Bullet[] shoot(){
        int xStep=this.width/4;
        int yStep=20;
        if(doubleFire>0){ //双倍
            Bullet[] bs=new Bullet[2];
            bs[0]=new Bullet(this.x+xStep,this.y-yStep);
            bs[1]=new Bullet(this.x+xStep*3,this.y-yStep);
            doubleFire-=2; //控制双倍子弹发射次数
            return bs;
        }else{
            Bullet[] bs=new Bullet[1];
            bs[0]=new Bullet(this.x+xStep*2,this.y-yStep);
            return bs;
        }

    }

    /**英雄机移动
     * @author wentao
     * @time Create in
     */
    public void move(int x,int y){
             this.x=x-this.width/2;
             this.y=y-this.height/2;
    }

    /**重写越界方法
     * @author wentao
     * @time Create in
     */
    public boolean outOfBounds(){
        return false; //英雄机永不越界
    }

    /**加命
     * @author wentao
     * @time Create in
     */
    public void deleteLife(){
            life--;
    }
    /**加命
     * @author wentao
     * @time Create in
     */
    public void addLife(){
        life++;
    }
    public int getLift(){
        return life;
    }

    /**加火力
     * @author wentao
     * @time Create in
     */
    public void addFire(){
        doubleFire+=20;
    }
    /**清空火力
     * @author wentao
     * @time Create in
     */
    public void cleaerFire(){
        doubleFire=0;
    }

    /**英雄机与敌机相撞
     * @author wentao
     * @time Create in
     */
    public boolean hit(FlyingObject other){
        int x1=other.x-this.width/2;
        int x2=other.x+other.width+this.width/2;
        int y1=other.y-this.height/2;
        int y2=other.y+other.height+this.height/2;
        int x=this.x+this.width/2;
        int y=this.y+this.height/2;
        return x>=x1 && x<=x2 && y>=y1 && y<=y2;
    }
}
