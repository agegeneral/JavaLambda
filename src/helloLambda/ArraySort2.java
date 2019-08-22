package helloLambda;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort2 {

	public static void main(String[] args) {
		Comparator<String> byLength = new Comparator<String>() {
			public int compare(String name1, String name2) {
				return name1.length() - name2.length();
			}
		};
		
		String[] names = {"Justin", "caterpillar", "Bush"};
		
		// 改變匿名類別的語法，稍微增加Arrays.sort()該行的可讀性
		Arrays.sort(names, byLength);
		
		for(int i=0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
	}

}
