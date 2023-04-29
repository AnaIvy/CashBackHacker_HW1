package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void testRemainIfAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 550;
        int actual = service.remain(450);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1500);
        Assert.assertEquals(actual, expected);
    }
}