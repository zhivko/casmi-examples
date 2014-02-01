package casmi.ui;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.Keyboard;
import casmi.Mouse;
import casmi.MouseButton;
import casmi.MouseEvent;
import casmi.graphics.color.ColorSet;
import casmi.graphics.element.Rect;


public class TextFieldExample extends Applet {

    TextField field;

    @Override
    public void setup() {
        setSize(1024, 768);
        setFPS(30);

        setBackgroundColor(ColorSet.WHITE);

        Rect r = new Rect(320, 240);
        r.setPosition(500, 160);
        r.setFillColor(ColorSet.BLUE);
        r.setStrokeColor(ColorSet.BLACK);
        r.setStrokeWidth(3.0);

        String [] names = {"foo", "bar", "baz"};

        field = new TextField();
        field.setWidth(100);
        field.addActionListener(new TextFieldActionListener() {

            @Override
            public void performed(String text) {
                System.out.println(text);
            }
        });

        addControlComponent(field);

        addObject(r);
    }

    @Override
    public void update() {}

    @Override
    public void exit() {}

    @Override
    public void mouseEvent(MouseEvent event, MouseButton button, Mouse mouse) {}

    @Override
    public void keyEvent(KeyEvent event, Keyboard keyboard) {}

    public static void main(String[] args) {
        AppletRunner.run("casmi.ui.TextFieldExample", "TextFieldExample");
    }
}