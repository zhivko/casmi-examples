/*
 *   casmi examples
 *   http://casmi.github.com/
 *   Copyright (C) 2011-2012, Xcoo, Inc.
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

package casmi.tween;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.MouseButton;
import casmi.MouseStatus;
import casmi.graphics.element.Rect;
import casmi.image.Texture;
import casmi.matrix.Vector2D;
import casmi.tween.equations.BounceOut;

/**
 * Example of TweenRepeat.
 *
 * @author Y. Ban
 *
 */
public class TweenRepeatExample  extends Applet {
    Rect r = new Rect(256, 64);
    Tweener t;

    @Override
    public void setup() {
        setSize(1024, 768);

        Texture tex = new Texture(getClass().getResource("/casmi/logo.png"));
        r.setTexture(tex);
        r.setPosition(200, 500);

        addObject(r);

		t = new Tweener(r);

		t.animatePosition(new Vector2D(200 + 300, 500), 3000, BounceOut.class);
		t.setRepeat(true);

		addTweener(t);
		t.start();
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
		AppletRunner.run("casmi.tween.TweenRepeatExample", "TweenRepeatExample");
	}

}
