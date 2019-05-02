package com.gupao.edu.delegate;


public class Boss {
    public Leader leader;
    public Boss(Leader leader){
        this.leader = leader;
    }

    public void delegate(String command){
        leader.doing(command);
    }
    public static void main(String[] args) {
        Boss boss = new Boss(new Leader());
        boss.delegate("加密");
    }
}
