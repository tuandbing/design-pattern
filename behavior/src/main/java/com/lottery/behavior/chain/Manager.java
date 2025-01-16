package com.lottery.behavior.chain;

public class Manager extends Handler{
    public Manager() {
        super(NUM_TWO, NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("组员" + leave.getName() + "请假" + leave.getNum() + "天,理由:" + leave.getContent());
        System.out.println("审批人:" + this.getClass().getSimpleName()); }
}
