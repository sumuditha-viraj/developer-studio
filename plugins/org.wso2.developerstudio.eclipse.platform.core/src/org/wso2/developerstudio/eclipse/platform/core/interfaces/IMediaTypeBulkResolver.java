/*
 * Copyright (c) 2010-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.platform.core.interfaces;

import java.io.InputStream;
import java.util.List;

public interface IMediaTypeBulkResolver extends IMediaTypeResolver {
	public boolean isInputStreamValidateSupported();

	public boolean isMediaType(InputStream dataStream) throws UnsupportedOperationException;

	public boolean isFileNameValidateSupported();

	public boolean isMediaType(String fileName) throws UnsupportedOperationException;

	public Object[] getAllMediaTypeData();

	public void setMediaTypeData(Object mediaTypeData);

	public String getMediaType();

	public int getPriority();

	public List<String> getExtensions();

	public String getDefaultExtension();
}
