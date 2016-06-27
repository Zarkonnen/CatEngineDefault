package com.zarkonnen.catenginedefault;

import com.zarkonnen.catengine.Condition;
import com.zarkonnen.catengine.Draw;
import com.zarkonnen.catengine.Fount;
import com.zarkonnen.catengine.Frame;
import com.zarkonnen.catengine.Game;
import com.zarkonnen.catengine.Input;
import com.zarkonnen.catengine.SlickEngine;
import com.zarkonnen.catengine.util.Clr;
import com.zarkonnen.catengine.util.ScreenMode;

public class Main implements Game {
	public static final Fount FOUNT = Fount.fromResource("libmono12", "/com/zarkonnen/catenginedefault/images/libmono12.txt");
	
	public static void main(String[] args) {
		SlickEngine se = new SlickEngine("Game", "/com/zarkonnen/catenginedefault/images/", "/com/zarkonnen/catenginedefault/sounds/", 60);
		se.setup(new Main());
		se.runUntil(Condition.ALWAYS);
	}

	@Override
	public void input(Input input) {
		if (input.keyDown("ESCAPE")) {
			input.quit();
		}
	}

	@Override
	public void render(Frame frame) {
		Draw d = new Draw(frame);
		ScreenMode sm = frame.mode();
		d.rect(Clr.BLACK, 0, 0, sm.width, sm.height);
		d.text("Hello world!", FOUNT, 10, 10);
	}
}
