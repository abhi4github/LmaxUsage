package com.at.lmaxusage.longevent.lambdabased;

import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent>
{
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
    {
        System.out.println("Event> " + event);
    }
}
