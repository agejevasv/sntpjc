package com.google.code.sntpjc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Timestamp tests
 * 
 * @author Viktoras Agejevas
 *
 */
public class TimestampTest {

	@Test 
	public void encodeDecodeTimestamp() {
		long time = System.currentTimeMillis();
		Timestamp ts1 = new Timestamp(time);
		byte[] data = ts1.getByteArray();
		Timestamp ts2 = new Timestamp(data);
		assertEquals(ts1.getUnixTimestamp(), ts2.getUnixTimestamp(), 0);
	}
}
