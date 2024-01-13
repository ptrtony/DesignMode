package com.zjq.javadesignmode.ui.state;

public class RaffleActivity {
    //State 表示活动当前的状态，是变化
    State state;
    //奖品数量
    int count;
    //四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器
    //1、初始化当前状态

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deductMoney() {
        this.state.deductMoney();
    }

    public void raffle() {
        if (this.state.raffle()) {
            this.state.dispensePrize();
        }
    }

    public void dispensePrize() {
        this.state.dispensePrize();
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public int getCount() {
        int curCount = count;
        count --;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
