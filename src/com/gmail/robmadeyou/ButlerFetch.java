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
		return ctx.backpack.select().id(8778).isEmpty();
	}

	@Override
	public void execute() {
		ctx.npcs.select().name("Butler").poll().interact("Fetch-from-bank");
	}
}
