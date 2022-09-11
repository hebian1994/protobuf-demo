package com.hll.netty.sixthexample.server;

import com.hll.netty.sixthexample.StudentInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<StudentInfo.Student> {// 泛型类型Student


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, StudentInfo.Student msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getAge());
        System.out.println(msg.getAddress());
    }
}
