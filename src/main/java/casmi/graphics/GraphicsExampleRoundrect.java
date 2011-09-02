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
import casmi.graphics.color.Color;
import casmi.graphics.element.Roundrect;

/**
 * Example of Graphics.
 * 
 * @author K. Nishimura
 * 
 */
public class GraphicsExampleRoundrect extends Applet {
    
    Roundrect r1 = new Roundrect(10, 500, 700, 500, 200);
    Roundrect r2 = new Roundrect(30, 200, 700, 200, 400);
    Roundrect r3 = new Roundrect(10,600, 200, 200, 100);
        
    public void setup(){
        setSize(1024, 768);

        r1.setFillColor(new Color(80, 180, 80));
        r1.setStrokeColor(new Color(100, 240, 100));
        r1.setStrokeWidth(3);
        
        r2.setFill(false);
        r2.setStrokeWidth(5);
        r2.setStrokeColor(new Color(180, 80, 80));
        
        r3.setFillColor(new Color(80, 80, 180));
        r3.setStrokeColor(new Color(120, 120, 240));
    
    }
    
    @Override
    public void draw(Graphics g) {
        g.render(r1);
        g.render(r2);
        g.render(r3);
    }
    
    public static void main(String args[]) {
        AppletRunner.run( "casmi.graphics.GraphicsExampleRoundrect", "Example");
    }
}
