package com.lottery.behavior.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waiter {
    private List<Command> commands;//可以持有很多的命令对象

    public Waiter() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");

        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command cmd = iterator.next();
            if (cmd != null) {
                cmd.execute();
            }
            iterator.remove();
        }
    }
}
