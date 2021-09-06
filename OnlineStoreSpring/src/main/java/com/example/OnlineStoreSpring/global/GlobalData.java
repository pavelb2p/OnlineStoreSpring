package com.example.OnlineStoreSpring.global;

import com.example.OnlineStoreSpring.model.Product;

import java.util.ArrayList;
import java.util.List;
/**
 * Storage  products in the shopping cart for registered users
 */
public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<>();
    }
}
