package com.company;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    private final Color RED = Color.red;

    private int x, y;
    private Color color;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.gray;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean checkHit(int x, int y) {
        if (x == this.x && y == this.y) {
            this.color = RED;
            return true;
        }
        return false;
    }

    public boolean isAlive() {
        return this.color != RED;
    }

    void paint(Graphics g, int cellSize, boolean hide) {
        if (!hide || (hide && color == RED)) {
            g.setColor(color);
            g.fill3DRect(x * cellSize + 1, y * cellSize + 1,
                    cellSize - 2, cellSize - 2, true);
        }
    }
}
