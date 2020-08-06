package org.cg.dcca;

import java.io.CharConversionException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		List<String> nameList=Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah",
                "allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle","annebelle");
		//System.out.println("enter the prefix");
		String prefix=scanner.next();
		
		List<CharactersCount>list=nameList.stream().filter(Filter.nameStartingWithPrefix(prefix)).map(Mapper.getDistinctCharactersCount()).collect(Collectors.toList());
		for (CharactersCount charactersCount : list) {
			System.out.println("\""+charactersCount.getName() + "\""+" has "+ charactersCount.getDistinctCharacterCount()+" distinct characters");
		}
		

	}

}
