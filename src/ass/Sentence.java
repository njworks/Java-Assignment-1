package ass;

import java.util.Arrays;

public class Sentence {

	private static String[] words;
	
	public Sentence(String [] words) { this.words = words;}
			
			public String toString(){
				StringBuilder eachstring = new StringBuilder();
				
				for(int x = 0; x < words.length; x++){
					eachstring.append(words[x] + " ");
					
				}
				String loopvalue = eachstring.toString();
				return loopvalue;

			}
			//working out average length of words
			public double meanLength(){
				double characters = 0;
				double total = 0;
				int maxlength = words.length;
				int wordposition = 0;
				
				
				while(wordposition<=maxlength-1){
					total = characters + words[wordposition].length();
					characters = total;
					wordposition++;
				}
				double average = characters/maxlength;
				
				return average;
			}
			//longest 
			public String longest(){
				int maxlength = ((words.length));
				int finallength = 0;
				int current = words[finallength].length();
				int newPosition = 0;
				int currentPosition = 1;
				
				while(currentPosition<=maxlength-1){
					int x = words[currentPosition].length();
					if (x > current){
						current = x;
						newPosition = currentPosition;
						
					}currentPosition +=1;
				} 
			return words[newPosition];
			}
			
			public String[] sorted(){
				
				for(int start = 0; start< words.length; start++){
					for(int loopwhile = start +1; loopwhile < words.length; loopwhile++){
						
						if (words[loopwhile].compareTo(words[start])< 0 ){
							String store = words[start];
							words[start] = words [loopwhile];
							words[loopwhile] = store;
							
						}
					} 
				}
				return words;
			}
			
			public String shortest(){
				int maxlength = words.length;
				int newPosition = 0;
				int position = 1;
				int updatelength = 0;
				int currentlength = words[updatelength].length();
				while(position <= maxlength -1){
					int store = words[position].length();
					if (store < currentlength){
						currentlength = store;
						newPosition = position;
					}
					position += 1;
				}
				return words[newPosition];
			}
	
	public static void main(String[] args) {
		  String[] wordList = {"A", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
		  Sentence text = new Sentence(wordList);
		  System.out.println(text);
		  System.out.println("Shortest word: " + text.shortest());
		  System.out.println("Longest word: " + text.longest());
		  System.out.printf("Mean word length:%5.2f\n",text.meanLength());
		  String[] sortedText = text.sorted();
		  System.out.print("Sorted: " + Arrays.toString(sortedText)); 
		}
	}

