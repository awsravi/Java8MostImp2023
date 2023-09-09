package com.sep.it;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountRemoveSpecialchars {

	public static void main(String[] args) {
		//walking tree
		String sentence = "my name is Ravi, Ravi is good in java and also, ravi is coding.";

		List<String> lstr = Arrays.asList(sentence.split(" "));

		Map<String, Long> wordcount = lstr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordcount);

		Map<String, Long> output = Arrays.stream(sentence.toLowerCase().split(" "))
				.map(word -> word.replaceAll("[^a-zA-Z]", "")).filter(word -> !word.isEmpty())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(output);

	}

}
