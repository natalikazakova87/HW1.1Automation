package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CashbackHackTest {
    @Test
    public void testForLessAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testForMoreAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_500;

        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testForExactlyAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
