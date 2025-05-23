package com.company.GamaView;

import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView {

    public ArrayList<TenCommandment> getStones() {
        return stones;
    }

    private final ArrayList<TenCommandment> stones = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    private int count;

    public TenCommandmentsView() {
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        count = 0;

        stones.add(new TenCommandment(5, 5));
        stones.add(new TenCommandment(1, 5));
        stones.add(new TenCommandment(3, 4));
        stones.add(new TenCommandment(2, 5));
        stones.add(new TenCommandment(3, 5));
        stones.add(new TenCommandment(4, 5));
        stones.add(new TenCommandment(5, 7));
        stones.add(new TenCommandment(8, 9));
        stones.add(new TenCommandment(1, 10));
        stones.add(new TenCommandment(2, 10));

        elements.addAll(stones);
    }
}