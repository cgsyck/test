package com.book.chapter8;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 DateInterval interval = new DateInterval();
		 Pair<LocalDate> pair = interval;
		 pair.setFirst(LocalDate.now());
		 pair.setSecond(LocalDate.now());
	}

}
