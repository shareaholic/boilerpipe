/**
 * boilerpipe
 *
 * Copyright (c) 2009 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.l3s.boilerpipe.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tokenizes text according to Unicode word boundaries and strips off non-word
 * characters.
 * 
 * @author Christian Kohlschütter
 */
public class UnicodeTokenizer {
  private static final Pattern TOKENIZER = Pattern.compile("[ ]*([-\"'\\.,!@:;\\$\\?\\(\\)/]*(?:[-\\w\"'\\.,!@:;\\$\\?\\(\\)/]+|[-\\W\"'\\.,!@:;\\$\\?\\(\\)/]+))[ ]*");

    /**
     * Tokenizes the text and returns an array of tokens.
     * 
     * @param text The text
     * @return The tokens
     */
    public static List<CharSequence> tokenize(final CharSequence text) {
      final Matcher m = TOKENIZER.matcher(text);
      final List<CharSequence> tokens = new LinkedList<>();
      while(m.find()) {
        tokens.add(text.subSequence(m.start(1), m.end(1)));
      }
      return tokens;
    }
}
