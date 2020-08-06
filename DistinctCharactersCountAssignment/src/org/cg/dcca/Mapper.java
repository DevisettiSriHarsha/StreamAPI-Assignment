package org.cg.dcca;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Mapper {
	
	public static Function<String, CharactersCount> getDistinctCharactersCount(){
		return name->{
			char characters[]=name.toCharArray();
			Set<Character> distinctCharacters = new HashSet<Character>(); 
			
			for(char c:characters) {
				distinctCharacters.add(c);
			}
			return new CharactersCount(name,distinctCharacters.size());
		};
	}

}
