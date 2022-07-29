package com.sjms.wq.行为型.中介者模式;

/**
 * <p>
 * 抽象机长
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:07
 */
public abstract class AbstractCaptain {

    private boolean state = false;

    private AbstractControlTower abstractControlTower;

    private Integer id;
    /**
     * 起飞
     */
    abstract void fly();

    /**
     * 降落
     */
    abstract void land();

    /**
     * 完成
     */
    abstract void success();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAbstractControlTower(AbstractControlTower abstractControlTower) {
        this.abstractControlTower = abstractControlTower;
    }

    public AbstractControlTower getAbstractControlTower() {
        return abstractControlTower;
    }

    public boolean isState() {
        return state;
    }

    public void setTrueState() {
        this.state = true;
    }

    public void setFalseState() {
        this.state = false;
    }

}
