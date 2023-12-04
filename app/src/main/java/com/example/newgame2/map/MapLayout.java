package com.example.newgame2.map;

public class MapLayout {
    public static final int TILE_WIDTH_PIXELS = 64;
    public static final int TILE_HEIGHT_PIXELS = 64;
    public static final int ROWS = 50;  //rows of tiles
    public static final int COLUMNS = 50;   //columns of tiles

    private int[][] layout;

    public MapLayout() {
        makeLayout();
    }

    public int[][] getLayout() {
        return layout;
    }

    //design map here 50x50 --> 0 is desert, 1 is lava, 2 is grass, 3 is water
    private void makeLayout() {
        layout = new int[][] {
                {1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 3,3,3,3,3,3,3,3,3,3, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,2,2,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 2,2,2,2,2,2,2,2,2,2, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 3,3,3,3,3,3,3,3,3,3, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 3,3,3,3,3,3,3,3,3,3, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 3,3,3,3,3,3,3,3,3,3, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,3,3,3,3, 3,3,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 3,3,3,3,3,3,3,3,3,3, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,3,3,3,3, 3,3,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 3,3,3,3,3,3,3,3,3,3, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,3,3,3,3, 3,3,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,2, 2,2,2,2,2,2,2,2,2,2, 2,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,3,3,3,3, 3,3,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,3,3,3,3, 3,3,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,2,2,2,2,2, 2,2,2,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,1 },
                {1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1,1,1 }
        };
    }
}
