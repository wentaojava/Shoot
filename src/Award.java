/**定义奖励机制
 *
 * @author wentao
 * @time Create in 14:10 2017/8/29 0029
 * @copyright Wuxi ,Ltd.copyright 2015-2025
 */
public interface Award {
    public int DOUBLE_FIRE=0;//定义火力值
    public int LIFE=1; //定义命
    /**获取奖励类型
     * @author wentao
     */
    public int getType();

}
