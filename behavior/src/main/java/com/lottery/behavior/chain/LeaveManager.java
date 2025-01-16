package com.lottery.behavior.chain;

public class LeaveManager extends Dept{
    //各位领导
    private static GroupLeader groupLeader = new GroupLeader();
    private static Manager manager = new Manager();
    private static GeneralManager generalManager = new GeneralManager();

    static {
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
    }

    public LeaveManager(String name) {
        super(name);
    }

    @Override
    public Boolean handle(LeaveRequest leave) {
        groupLeader.submit(leave);
        return true;
    }
}
