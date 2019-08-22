package helloLambda;

import java.util.Arrays;

public class ArraySort5 {
	
	// 使用某類別的方法排序
	public static void main(String[] args) {
		String[] names = {"Justin", "caterpillar", "Bush"};
		
		Arrays.sort(names, (name1, name2) 
				-> StringOrder.byLength(name1, name2));
		
		// 更進一步把name1, name2省略
		// 這行意思是，將names參數傳到StringOrder物件的byLength方法
		Arrays.sort(names, StringOrder::byLength);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
