package com.zjq.javadesignmode.ui.visitor;

public class Wait extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println(" 男人的评价是该歌手待定...");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println(" 女人的评价是该歌手待定...");
    }
}
