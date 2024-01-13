package com.zjq.javadesignmode.ui.state;

public class ClientTest {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 300; i++) {
            System.out.println("-----------第" + (i + 1) + "次抽奖");
            //参加抽奖，第一步点击扣除积分
            activity.deductMoney();
            //第二步抽奖
            activity.raffle();
        }
    }
}
