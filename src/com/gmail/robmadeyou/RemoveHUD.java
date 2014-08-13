package com.gmail.robmadeyou;

import org.powerbot.script.rt6.ClientContext;

import java.awt.*;

/**
 * Created by apex on 13/08/14.
 */
public class RemoveHUD extends Task<ClientContext> {
	public RemoveHUD(ClientContext arg0) {
		super(arg0);
	}

	@Override
	public boolean activate() {
		return ctx.widgets.widget(1188).valid();
	}

	@Override
	public void execute() {
		ctx.widgets.widget(1188).component(3).interact("Continue");
		Oaker.c = Color.green;
	}
}
