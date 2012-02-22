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

package casmi;

import casmi.graphics.color.ColorSet;
import casmi.graphics.element.Ellipse;
import casmi.graphics.element.Text;
import casmi.graphics.element.TextAlign;

/**
 * Full screen example.
 * 
 * @see casmi.Applet
 * 
 * @author T. Takeuchi
 */
public class FullScreenExample extends Applet {
    
	Ellipse ellipse = new Ellipse(30);
    Text text = new Text("Click or type ESC key to exit.");
    
    @Override
    public void setup() {
        // setFullScreen(boolean) must be used in setup().
        setFullScreen(true);    

        ellipse.setFillColor(ColorSet.WHITE);
        
        text.setStrokeColor(ColorSet.RED);
        text.setAlign(TextAlign.CENTER);
        
        for (int x = 30; x < getWidth(); x += 80) {
            for (int y = getHeight() - 30; 0 < y; y -= 80) {
            	Ellipse el = (Ellipse) ellipse.clone();
            	el.setPosition(x, y);
                addObject(el);
            }
        }
        
        Text text = new Text("Click or type ESC key to exit.");
        text.setStrokeColor(ColorSet.RED);
        text.setAlign(TextAlign.CENTER);
        text.setX(getWidth()  / 2);
        text.setY(getHeight() / 2);
        addObject(text);
    }
    
    @Override
    public void update() {}
    
    @Override
    public void mouseEvent(MouseEvent e, MouseButton b) {
        if (e == MouseEvent.PRESSED) {
            System.exit(0);
        }
    }

    @Override
    public void keyEvent(KeyEvent e) {
        if (e == KeyEvent.TYPED && getKeycode() == 27) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        AppletRunner.run("casmi.FullScreenExample", "Full Screen Example");
    }

	@Override
	public void mouseWheelEvent() {
		// TODO Auto-generated method stub
		
	}	
}
