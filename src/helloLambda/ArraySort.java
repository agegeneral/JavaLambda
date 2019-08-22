package helloLambda;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 將名稱依長度進行排序
		String[] names = { "Justin", "caterpillar", "Bush" };
		
		Arrays.sort(names, new Comparator<String>() {
			public int compare(String name1, String name2) {
				return name1.length() - name2.length();
			}
		});
		
		for(int i=0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
	}

}
