package com.zjq.javadesignmode.ui.state;

/**
 * 状态抽象类
 */
public abstract class State {
    // 扣除积分50
    public abstract void deductMoney();
    // 是否抽中奖品
    public abstract boolean raffle();
    // 发放奖品
    public abstract void dispensePrize();
}
