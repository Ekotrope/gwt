/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.canvas.dom.client;

/**
 * Gradient object used with {@link Context2d}.
 * 
 * <p>
 * <span style="color:red">Experimental API: This class is still under rapid
 * development, and is very likely to be deleted. Use it at your own risk.
 * </span>
 * </p>
 * 
 * This class serves as a reference to a gradient created using {@link Context2d#createPattern}
 * 
 * @see <a href="http://www.w3.org/TR/2dcontext/#canvasgradient">CanvasGradient</a>
 */
public class CanvasGradient extends FillStrokeStyle {

  protected CanvasGradient() {
  }

  /**
   * Adds a new color stop to the gradient.
   * 
   * @param offset value between 0 and 1 for where the color stop is located.
   * @param color color at the stop.
   */
  public final native void addColorStop(float offset, String color) /*-{
    this.addColorStop(offset, color);
  }-*/;
}
