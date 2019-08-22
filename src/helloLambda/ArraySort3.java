package helloLambda;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort3 {

	public static void main(String[] args) {
		/**
		 * java.util.Comparator時的匿名類別時依舊冗長，
		 * 有太多重複的資訊，如果使用JDK8的話，
		 * 你可以使用Lambda特性去除重複的資訊
		 * 例如，宣告byLength時已經寫了一次Comparator<String>，
		 * 為什麼實作匿名類別時又得寫一次Comparator<String>？
		 * 使用JDK8的Lambda特性的話，可以寫為
		 */
		Comparator<String> byLength = (String name1, String name2) 
				-> name1.length() - name2.length();

		String[] names = { "Justin", "caterpillar", "Bush" };

		Arrays.sort(names, byLength);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
