package com.company.GamaView;

import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView {

    private final TenCommandment stone;

    public TenCommandment getStone() {
        return stone;
    }

    public TenCommandmentsView() {
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        stone = new TenCommandment(5, 5);
        elements.add(stone);
    }
}
