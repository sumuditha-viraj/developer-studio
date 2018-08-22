/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.wso2plugin.template.manager.ui.elements;

import java.util.Vector;

/*
 * WSO2 Plugin Element List which defined a list of WSO2 Plugin elements defined
 * in the developer studio
 * plugins available at startup.
 */
public class WSO2PluginSampleExtList {

	private Vector<WSO2PluginSampleExt> WSO2PluginElemList;

	public WSO2PluginSampleExtList() {
		super();
		WSO2PluginElemList = new Vector<WSO2PluginSampleExt>();
	}

	public void addWSO2Plugin(WSO2PluginSampleExt pluginElem) {
		WSO2PluginElemList.add(pluginElem);
	}

	public Object[] getChildren() {
		if (WSO2PluginElemList.size() == 0)
			return new Object[0];
		Object[] result = new Object[WSO2PluginElemList.size()];
		WSO2PluginElemList.copyInto(result);
		return result;
	}

	public void add(WSO2PluginSampleExt pluginElem) {
		WSO2PluginElemList.addElement(pluginElem);

	}

	public String toString() {
		return WSO2PluginElemList.toString();
	}

}
