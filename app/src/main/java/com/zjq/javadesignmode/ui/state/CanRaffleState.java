package com.zjq.javadesignmode.ui.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除了积分，不能再扣了
    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分");
    }

    //可以抽奖，抽完奖后根据实际情况，改成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%中奖机会
        if (num == 0) {
            //改变活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            //改变状态为不能抽奖
            System.out.println("很遗憾没有抽中奖品！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品！");
    }
}
