/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  https://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * https://plantuml.com/patreon (only 1$ per month!)
 * https://plantuml.com/paypal
 * 
 * This file is part of PlantUML.
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
 *
 *
 * Original Author:  Arnaud Roques
 */

package smetana.core;

import smetana.core.amiga.Area;
import smetana.core.amiga.StarStruct;

public class UnsupportedStruct implements __struct__ {

	public __ptr__ setPtr(String fieldName, __ptr__ value) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void setStruct(String fieldName, __struct__ value) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void setInt(String fieldName, int value) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void setDouble(String fieldName, double value) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void memcopyFrom(Area source) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public __struct__ copy() {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void ___(__struct__ other) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public void ____(__ptr__ other) {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public StarStruct amp() {
		throw new UnsupportedOperationException(getClass().toString());
	}

	public StarStruct getInternalData() {
		throw new UnsupportedOperationException(getClass().toString());
	}


}
