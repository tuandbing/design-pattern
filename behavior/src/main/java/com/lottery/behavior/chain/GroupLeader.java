package com.lottery.behavior.chain;

public class GroupLeader extends Handler{
    public GroupLeader() {
        super(NUM_ONE, NUM_TWO);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("组员" + leave.getName() + "请假" + leave.getNum() + "天,理由:" + leave.getContent());
        System.out.println("审批人:" + this.getClass().getSimpleName());
    }
}
