/*
 * This file is part of WiFi101 Updater Arduino-IDE Plugin.
 * Copyright 2016 Arduino LLC (http://www.arduino.cc/)
 *
 * Arduino is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, you may use this file as part of a free software
 * library without restriction.  Specifically, if other files instantiate
 * templates or use macros or inline functions from this file, or you compile
 * this file and link it with other files to produce an executable, this
 * file does not by itself cause the resulting executable to be covered by
 * the GNU General Public License.  This exception does not however
 * invalidate any other reasons why the executable file might be covered by
 * the GNU General Public License.
 */
package cc.arduino1.plugins.wifi101;

import processing.app1.Editor;
import processing.app1.tools.Tool;

public class WiFi101 implements Tool {
	Editor editor;

	UpdaterImpl updater;

	public void init(Editor editor) {
		this.editor = editor;
	}

	public String getMenuTitle() {
		return "WiFi101 / WiFiNINA Firmware Updater";
	}

	public synchronized void run() {
		if (updater == null)
			try {
				updater = new UpdaterImpl();
			} catch (Exception e) {
				e.printStackTrace();
				// Failed to open tool
				return;
			}
		updater.setVisible(true);
	}

}
