package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<Point> body;
    private Direction direction;

    public Snake() {
        direction = Direction.D;
        body = new ArrayList<>();

        body.add(new Point(2,5));
        body.add(new Point(2,4));
        body.add(new Point(2,3));
    }

    public void draw(Graphics g) {
        g.setColor(new Color(70, 125, 16));
        for (Point point : getTail()) {
            g.fillRect(point.x*Board.SIZE, point.y* Board.SIZE, Board.SIZE, Board.SIZE);
        }

        g.setColor(new Color(20, 95, 0, 255));
        g.fillOval(getHead().x*Board.SIZE, getHead().y* Board.SIZE, Board.SIZE, Board.SIZE);
    }

    private Point getHead() {
        return body.get(0);
    }

    private List<Point> getTail() {
        return body.subList(1, body.size());
    }

    public void move() {
        for (int i = body.size()-1; i>0; i--) {
            body.get(i).setLocation(body.get(i-1));
        }

        switch (direction) {
            case D -> getHead().y++;
            case U -> getHead().y--;
            case R -> getHead().x++;
            case L -> getHead().x--;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
