package com.example.domain.tasks;

import com.sun.tools.javac.util.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsHashCode {

    public static void main(String[] arg) {
        Map<Currency, Double> map = new HashMap<>();
        map.put(new Currency("USD"), 1.1);
        System.out.println(map.get(new Currency("USD")) == 1.1);
    }

    static class Currency {
        String currencyCode;

        public Currency(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Currency currency = (Currency) o;
            return Objects.equals(currencyCode, currency.currencyCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(currencyCode);
        }
    }
}
