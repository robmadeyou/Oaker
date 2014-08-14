package com.gmail.robmadeyou;

import org.powerbot.script.rt6.ClientContext;

import java.awt.*;

/**
 * Created by apex on 13/08/14.
 */
public class Remove extends Task<ClientContext> {
	public Remove(ClientContext arg0) {
		super(arg0);
	}

	@Override
	public boolean activate() {
		return ctx.objects.select().id(13345).poll().inViewport() && !ctx.widgets.widget(1188).valid();
	}

	@Override
	public void execute() {
		ctx.objects.select().id(13345).poll().interact("Remove");
		Oaker.c = Color.cyan;
	}
}
