package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;

        int expected = 200;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remainUpToThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remainThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);

    }
}