/*
 *   casmi examples
 *   http://casmi.github.com/
 *   Copyright (C) 2011, Xcoo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package casmi.graphics;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.MouseButton;
import casmi.MouseStatus;
import casmi.graphics.color.RGBColor;
import casmi.graphics.element.Quad;

/**
 * Example of Graphics.
 *
 * @author K. Nishimura
 *
 */
public class QuadExample extends Applet {

    Quad q1 = new Quad(500, 200, 600, 200, 700, 800, 300, 500);
    Quad q2 = new Quad(200, 300, 300, 300, 200, 500, 300, 400);

    @Override
    public void setup() {
        setSize(800, 600);

        q1.setFillColor(new RGBColor(0.3, 0.7, 0.3));
        q1.setStrokeColor(new RGBColor(0.4, 0.9, 0.4));
        q2.setFill(false);
        q2.setStrokeWidth(5);
        q2.setStrokeColor(new RGBColor(0.7, 0.3, 0.3));

        addObject(q1);
        addObject(q2);
    }

    @Override
    public void update() {}

    @Override
    public void exit() {}

    @Override
    public void mouseEvent(MouseStatus e, MouseButton b) {}

    @Override
    public void keyEvent(KeyEvent e) {}

    public static void main(String[] args) {
        AppletRunner.run("casmi.graphics.QuadExample", "QuadExample");
    }

}
