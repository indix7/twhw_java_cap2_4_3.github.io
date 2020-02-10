package com;

import java.util.ArrayList;

public interface DirectionImplement {
    public static final ArrayList<Character> DIRECTION = new ArrayList<Character>() {{
        add('N');
        add('W');
        add('S');
        add('E');
    }};

    public static char left(char direction) {
        int index = DIRECTION.indexOf(direction) + 1;
        if (index > 3) {
            index -= 4;
        }
        return DIRECTION.get(index);
    }

    public static char right(char direction) {
        int index = DIRECTION.indexOf(direction) - 1;
        if (index < 0) {
            index += 4;
        }
        return DIRECTION.get(index);
    }

    /**
     * 传入当前方向direction和期望调转的方向label
     * @param direction 当前方向
     * @param label 期望调转方向
     * @return 调转后方向
     */

    public default char turn(char direction, String label) {
        if (DIRECTION.contains(direction)) {
            if (label.equals("left")) {
                return left(direction);
            } else {
                return right(direction);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

}
