package al.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collect- List/Set 
		//ArrayList
		ArrayList<String[]> aList= new ArrayList<String[]>();
		aList.add(new String[]{"1","2"});
		aList.add(new String[]{"11","12"});
		aList.add(new String[]{"21","22"});
		System.out.println(aList);
		System.out.println(aList.size());
		//aList.add(2, null);
		System.out.println(aList);
		System.out.println(aList.size());
		System.out.println(aList.get(1).length);
		//���ֳ����������1��Iterator������ 2��ListIterator��Iterator���ӽӿڣ�ר����List���3��for each �������ͼ��� 4��for
		//1��Iterator������  ����collectʵ������iterator()���������� Iterator
		System.out.println("\nIterator:");
		Iterator iterator= aList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString()+"->");
		}
		//2.
		//3.for...each
		System.out.println("\nfor...each:");
		for(String[] as :aList) {			
			System.out.println(as.toString()+"->");
		}
		
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("test1");
		aa.add("test2");	
		System.out.println(aa);//[test1, test2]
		String[] bb= new String[] {"1","8"};
		System.out.println(String.valueOf(bb));
		
		//4.
		
		//Map
		Map<Integer,String> stuMap= new HashMap<Integer,String>();
		stuMap.put(1, "aa");//������Ԫ��    All(Map)
		stuMap.put(2, "bb");stuMap.put(3, "cc");
		System.out.println(stuMap);//{1=aa, 2=bb} ��ӡ���{key1=value1,key2=value2,...}
		String removeValue=stuMap.remove(4);//ɾ��Ԫ�� remove(key) return removeValue = aa  / null
		System.out.println(removeValue);
		boolean iscontains= stuMap.containsKey(2);//�Ƿ������ֵ containsKey(key) return boolean = true
		
		System.out.println(iscontains);
		
		
		
		

	}

}