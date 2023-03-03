package model.util;

import java.awt.*;
import java.math.MathContext;
import java.util.Scanner;

import model.Order;

import static java.lang.System.out;


public class Metodos {

    private Object getPagamento;

    public Metodos() {
    }

    public static class TotalPedidos extends Order {
        double total = Double.parseDouble(products + getPrice() * quantidade.doubleValue());

        public double getTotal() {
            this.total = total;
            return total;
        }
    }
}
