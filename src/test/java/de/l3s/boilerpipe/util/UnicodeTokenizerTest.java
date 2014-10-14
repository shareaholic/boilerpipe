package de.l3s.boilerpipe.util;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class UnicodeTokenizerTest {

  @Test
  public void testTokenize() {
    assertThat(UnicodeTokenizer.tokenize(
        "its it's where? hello! a.b.getFoo() cat(<)soup) d  b"), equalTo(Arrays.asList(new CharSequence[] {
        "its","it's","where?","hello!","a.b.getFoo()","cat(","<)","soup)","d","b"})));
  }
}