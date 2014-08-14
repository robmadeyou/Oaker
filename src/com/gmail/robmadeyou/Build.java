package com.gmail.robmadeyou;

import org.powerbot.script.rt6.ClientContext;

import java.awt.*;

/**
 * Created by apex on 13/08/14.
 */
public class Build extends Task<ClientContext> {

	private boolean doorBuilt = true;
	private boolean HUDOpen = false;
	public Build(ClientContext arg0) {
		super(arg0);
	}

	@Override
	public boolean activate() {
		return ctx.objects.select().id(15327).poll().inViewport() && ctx.backpack.select().id(8778).count() >= 10 && !ctx.widgets.widget(1306).valid();
	}

	@Override
	public void execute() {
		ctx.objects.select().id(15327).poll().interact( "Build" );
		Oaker.c = Color.magenta;
		/*GameObject door = ctx.objects.select().id(13345).poll() : ctx.objects.select().id(15327).poll();;
		if(doorBuilt)
		{
			if(door.inViewport()) {
				if (HUDOpen || door.interact("Remove")) {
					HUDOpen = true;
					if (ctx.widgets.widget(1188).component(3).interact("Continue")) {
						this.HUDOpen = false;
						this.doorBuilt = false;
					}
				}
			}else{
				ctx.camera.turnTo(door);
			}
		}
		else
		{
			if(door.inViewport()) {
				if ( HUDOpen || door.interact("Build")) {
					HUDOpen = true;
					if (ctx.widgets.widget(1306).component(4).interact("Build")) {
						this.HUDOpen = false;
						this.doorBuilt = true;
					}
				}
			}else{
				ctx.camera.turnTo(door);
			}
		}*/
	}
}
