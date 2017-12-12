package alizarchik.alex.rgbcircles;

/**
 * Created by aoalizarchik.
 */

public interface ICanvaView {
    void drawCircle (SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
