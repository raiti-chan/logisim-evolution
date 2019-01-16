package com.raitichan.logisim;

import java.util.Collections;
import java.util.List;

import com.cburch.logisim.tools.Tool;

/**
 * <br>Created by Raiti-chan on 2019/01/16.
 *
 * @author Raiti-chan
 * @version 1.0.0
 * @since 1.0.0
 */
public class Library extends com.cburch.logisim.tools.Library {
	
	@Override
	public String getName () {
		return "Raiti'sLib";
	}
	
	@Override
	public boolean removeLibrary (String name) {
		return false;
	}
	
	@Override
	public List<? extends Tool> getTools () {
		return Collections.emptyList();
	}
}
