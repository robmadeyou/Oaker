package com.gmail.robmadeyou;

import org.powerbot.script.rt6.ClientContext;

import java.awt.*;

/**
 * Created by apex on 13/08/14.
 */
public class BuildHUD extends Task<ClientContext> {

	public BuildHUD(ClientContext arg0) {
		super(arg0);
	}

	@Override
	public boolean activate() {
		return ctx.widgets.widget(1306).valid() && ctx.backpack.select().id(8778).count() >= 10;
	}

	@Override
	public void execute() {
		ctx.widgets.widget(1306).component(4).interact("Build");
		Oaker.c = Color.yellow;
	}
}
