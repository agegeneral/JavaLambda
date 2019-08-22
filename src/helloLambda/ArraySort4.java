package helloLambda;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort4 {

	public static void main(String[] args) {
		/**
		 * 仔細看看，還有重複的資訊，
		 * 既然宣告變數時使用了Comparator<String>，
		 * 為什麼的參數上又得宣告一次String？
		 * 實際上確實不用，因為編譯器確實可以從變數的宣告型態
		 * 得知這個資訊，因此可以再簡化為
		 */
//		Comparator<String> byLength = (name1, name2) 
//				-> name1.length() - name2.length();
				
		String[] names = { "Justin", "caterpillar", "Bush" };
	
		// byLength等號右邊的運算式是夠簡短了，將它直接放到Arrays的sort()方法中
		Arrays.sort(names, (name1, name2) 
				-> name1.length() - name2.length());
		/**
		 * 因為編譯器可以從names推斷，
		 * sort()方法的第二個參數型態實際上就是Comparator<String>，
		 * 因而name1與name2還是不用宣告型態
		 */
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
