package com.tactfactory.testu.entities;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BasicTest {

	@Test
	public void test1() {
		List<Integer> results = new ArrayList<Integer>();
		List<Integer> testedValues = new ArrayList<Integer>();

		for (int a = -10; a < 10; a++) {
			for (int b = -10; b < 10; b++) {
				results.add(a + a);
				testedValues.add(a * 2);
			}
		}

		StringBuilder data = new StringBuilder();
		data.append("tested values : {\n");
		for (int i = 0; i < testedValues.size() - 1; i++) {
			data.append(testedValues.get(i) + ",");
		}
		data.append(testedValues.get(testedValues.size() - 1));
		data.append("}\n");

		data.append("obtained values : {\n");
		for (int i = 0; i < results.size() - 1; i++) {
			data.append(results.get(i) + ",");
		}
		data.append(results.get(results.size() - 1));
		data.append("}\n");

		boolean result = true;
		for (int i = 0; i < results.size(); i++) {
			data.append("on iteration " + i);
			// assertEquals(data.toString() + "on iteration " + i,testedValues.get(i),
			// results.get(i));
			if (!testedValues.get(i).equals(results.get(i))) {
				result = false;
				break;
			}
		}

		assertTrue(data.toString(), result);
	}
}
