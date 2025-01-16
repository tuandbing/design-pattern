package com.lottery.behavior.chain;

public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_TWO = 3;
    protected final static int NUM_THREE = 7;

    private int startNum;
    private int endNum;
    private Handler nextHandler;

    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public Handler(int startNum) {
        this.startNum = startNum;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public final void submit(LeaveRequest leave){
        if(0 == this.startNum){
            return;
        }

        //如果请假天数达到该领导者的处理要求
        if(leave.getNum() >= this.startNum){
            this.handleLeave(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > endNum){
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }
    }

    //各级领导处理请假条方法
    protected abstract void handleLeave(LeaveRequest leave);
}
