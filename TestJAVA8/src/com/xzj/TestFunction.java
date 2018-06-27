
package com.xzj;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class TestFunction {
	
    // functional interface  
    @FunctionalInterface  
    interface StringMapper{  
        int map(String str);  
    }  

	@Test
	public void test1() throws Exception {
		StringMapper mapper=str->str.length();  
        System.out.println(mapper.map("chen"));  
          
        // Function <T, R>  
        Function<Integer,Integer> square1=x->x*x;  
        System.out.println(square1.apply(5));  
          
          
        // chaining three functions  
        Function<Integer,Integer> a=(x)->x*3;
        Function<Long, Long> chainedFunction = ((Function<Long, Long>)(x -> x * x))  
                .andThen(y -> y + 1)  
                .andThen(x -> x * x);  
        System.out.println(chainedFunction.apply(3L));  
          
        // predictates  
        Predicate<Integer> greaterThanTen=x->x>10;  
        System.out.println(greaterThanTen.test(15));  
	}
	@Test
	public void test2() throws Exception {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		//features.forEach(n -> System.out.println(n));
		//features.forEach(x->System.out.println(x));
		List<String> list = features.stream().map(this::get).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	private String get(String str) {
		return "name:"+str;
	}
	@Test
	public void test8() throws Exception {
		String source="time>60";
		String source2="time>61,time<60";
		int hashCode1 = source.hashCode();
		int hashCode2 = source2.hashCode();
		long l1 = hashCode(source);
		long l2 = hashCode(source2);
		
		System.out.println(hashCode1);
		System.out.println(hashCode2);
	}
	
	//hashcodeÔöÇ¿Ëã·¨
	static final long[] byteTable = createLookupTable();  
	static final long HSTART = 0xBB40E64DA205B064L;  
	static final long HMULT = 7664345821815920749L;  
	  
	private static final long[] createLookupTable() {
	    long[] byteTable = new long[256];  
	    long h = 0x544B2FBACAAF1684L;  
	    for (int i = 0; i < 256; i++) {
	        for (int j = 0; j < 31; j++) {  
	            h = (h >>> 7) ^ h;  
	            h = (h << 11) ^ h;  
	            h = (h >>> 10) ^ h;  
	        }  
	        byteTable[i] = h;  
	    }  
	    return byteTable;  
	}  
	public static long hashCode(CharSequence cs) {
	    long h = HSTART;  
	    final long hmult = HMULT;  
	    final long[] ht = byteTable;  
	    final int len = cs.length();  
	    for (int i = 0; i < len; i++) {  
	        char ch = cs.charAt(i);  
	        h = (h * hmult) ^ ht[ch & 0xff];  
	        h = (h * hmult) ^ ht[(ch >>> 8) & 0xff];  
	    }  
	    return h;  
	}  
	void it() {
		System.out.println("---");
	}
}
