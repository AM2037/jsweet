/* 
 * JSweet - http://www.jsweet.org
 * Copyright (C) 2015 CINCHEO SAS <renaud.pawlak@cincheo.fr>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package source.structural.globalclasses.c;

import static jsweet.util.Lang.$delete;
import static jsweet.util.Lang.$get;
import static jsweet.util.Lang.$set;

@SuppressWarnings("all")
class Globals {

	public static void test() {
		Object val;
		val = $get(new GlobalFunctionGetSetDelete(), "ttest");
		$set(new GlobalFunctionGetSetDelete(), "ttest", val);
		$delete(new GlobalFunctionGetSetDelete(), "ttest");
		val = $get(GlobalFunctionGetSetDelete.class, "ttest");
		$set(GlobalFunctionGetSetDelete.class, "ttest", val);
		$delete(GlobalFunctionGetSetDelete.class, "ttest");
		
		// valid
		def.js.Object otherObject = null;
		otherObject.$get("test");
		otherObject.$set("test", val);
		otherObject.$delete("test");
	}
}

public class GlobalFunctionGetSetDelete {

	public void main(String[] args) {
	}
}
