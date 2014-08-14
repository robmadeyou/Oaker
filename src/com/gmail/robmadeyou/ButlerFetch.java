package com.gmail.robmadeyou;

import org.powerbot.script.rt6.ClientContext;

/**
 * Created by apex on 13/08/14.
 */
public class ButlerFetch extends Task<ClientContext>{

	public ButlerFetch(ClientContext arg0) {
		super(arg0);
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().id(8778).count() < 10 && !ctx.objects.select().id(13345).poll().inViewport();
	}

	@Override
	public void execute() {
		ctx.npcs.select().name("Butler").poll().interact("Fetch-from-bank");
	}
}
