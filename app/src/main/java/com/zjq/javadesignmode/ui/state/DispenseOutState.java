package com.zjq.javadesignmode.ui.state;

public class DispenseOutState extends State {
    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次再参加");
    }
}
