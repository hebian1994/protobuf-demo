package com.hll.netty.sixthexample.client;

import com.hll.netty.sixthexample.StudentInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestClientHandler extends SimpleChannelInboundHandler<StudentInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, StudentInfo.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //客户端创建连接之后就像服务端发送消息
        StudentInfo.Student student = StudentInfo.Student.newBuilder()
                .setName("张三")
                .setAge(20)
                .setAddress("合肥")
                .build();

        ctx.writeAndFlush(student);
    }
}
