package com.gmail.robmadeyou;

import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by apex on 13/08/14.
 */
@Script.Manifest(name = "Oaky", description = "Builds oak doors for ultimate experience")
public class Oaker extends PollingScript<ClientContext> implements PaintListener {
	public static Color c = Color.red;
	ArrayList<Task> tasklist = new ArrayList<Task>();

	private Build b = new Build(ctx);
	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void stop() {
		super.stop();
	}

	@Override
	public void suspend() {
		super.suspend();
	}

	@Override
	public void start() {
		super.start();
		tasklist.add(new Build(ctx));
		tasklist.add(new BuildHUD(ctx));
		tasklist.add(new Remove(ctx));
		tasklist.add(new RemoveHUD(ctx));
		tasklist.add(new ButlerFetch(ctx));
	}

	@Override
	public void poll() {
		for(Task t : tasklist)
		{
			if(t.activate()){
				t.execute();
			}
		}
	}

	@Override
	public void repaint(Graphics graphics) {
		graphics.setColor(c);
		graphics.drawRect(20,20,200,200);
	}
}
