/* Copyright 2015 CINCHEO SAS
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
package org.jsweet.test.transpiler.source.tscomparison;

import static jsweet.dom.Globals.console;
import static jsweet.util.Globals.$set;
import jsweet.lang.Interface;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Interface
class Options {
	String field;
}

public class StrongerTyping {
	public static void main(String[] args) {
		Consumer<Options> func = ((Supplier<Consumer<Options>>) () -> {
			// func signature could not be incorrect
			return (Options options) -> {
				console.log("options parameter is obviously correct", options.field);
			};
		}).get();

		func.accept(new Options() {
			{
				field = "foo";
				$set("whatever", "bar");
			}
		});
	}
}