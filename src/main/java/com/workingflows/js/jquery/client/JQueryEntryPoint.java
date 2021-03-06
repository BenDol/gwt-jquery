/*
 * Copyright 2014 Cristian Rinaldi & Andres Testi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.workingflows.js.jquery.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Load the JS library if it's not loaded
 *
 *
 * @author Cristian Rinaldi 
 * @author Andres Testi 
 */
public class JQueryEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        if (!isInjected()) {
            //LOADER
        }
    }

    /**
     * If jQuery JS loaded?
     * 
     * @return 
     */
    private native final boolean isInjected() /*-{
     if (!(typeof $wnd.jQuery === "undefined") && !(null===$wnd.jQuery)) {
        return true;
     }else{
        return false;
     }
     }-*/;

}
