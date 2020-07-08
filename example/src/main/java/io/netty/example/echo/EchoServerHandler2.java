package io.netty.example.echo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @since 2020/7/1
 */
public class EchoServerHandler2 extends ChannelInboundHandlerAdapter {
  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    /**
     * 每一个 Handler 的方法中，ctx 并不是统一对象
     */
    System.out.println("3");
    System.out.println(msg);
//    ctx.write(msg);
  }
}
