// ---docerion
// type: test
// title: Test span reporter
// summary: A test implementation of Spring Cloud Sleuth's SpanReporter that records spans in a list for assertions.
// ---

package io.crnk.spring.app;

import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.SpanReporter;

import java.util.ArrayList;
import java.util.List;

public class TestSpanReporter implements SpanReporter {

	public List<Span> spans = new ArrayList<>();

	@Override
	public void report(Span span) {
		spans.add(span);
	}
}
