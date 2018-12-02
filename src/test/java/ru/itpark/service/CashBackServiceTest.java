package ru.itpark.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    @Disabled("should calculate cashback for under imit amount")
    void cashbackUnderLimit() {
        CashBackService service=new CashBackService();
        int result = service.cashback(1_000);
        assertEquals(50,result);
    }
}