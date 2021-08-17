import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*Given 3 integer values, a b c, return their sum. However, if one of the values is 10 then it does not
count towards the sum and values to its right do not count. So, for example, if b is 10, then both b
and c do not count.*/





public class strings {
	static LinkedHashMap <Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
    static Set<Character>keys= hmap.keySet();
	static List <Character> listkeys = new LinkedList (keys);
	static strings st = new strings();

	static int sum;
	public static int freedomsum(int a, int b, int c) {
		if (a==10) {
		 sum = 0;
		}
		else if (b==10) {
			sum = a;
		}
		else if (c==10) {
		sum = a+b;	
		}
		else {
			sum = a+b+c;
		}
		return sum;

		
	}
	
	/*
	 * In JAVA, write a method that modifies a string using the following 3 rules:
	 * 1. Each word in the input string is replaced with the following: the first
	 * letter of the word, the count of distinct letters between the first and last
	 * letter, and the last letter of the word. For example, “Freedom Mortgage&quot;
	 * would be replaced by &quot;F4m M5e&quot;. 2. A &quot;word&quot; is defined as
	 * a sequence of alphabetic characters, delimited by any non-alphabetic
	 * characters. 3. Any non-alphabetic character in the input string should appear
	 * in the output string in its original relative location.
	 */
	
	public static String stringsplit(String word) {
  
	String[] wording =word.trim().split("\\W+");

		for (int i=0;i<wording.length;i++) {
			/*
			 * wording[i] = wording[i].replaceAll("[^\\w]", "");
			 * System.out.println("jjjjj"+wording[i])
			 */;
			 word = wording[i].toString();
			 
			 
//			 System.out.println("word is " +wording[i]);
//			 wording[i]=wording[i];
//			 word =  wording[i];
			 
			 replaceword(word);
			 System.out.println("value of word is "+word);
			 
	}
	  return word;
	  
	 }
	 
	
	public static int replaceword(String word) {
	
		
	
	char firstletter = word.charAt(0);
	char lstletter= word.charAt(word.length()-1);
	//int i=0;
	System.out.println(" "+firstletter);
	System.out.println(" "+lstletter);
	int counter =0;
	  for (char c: word.toCharArray())
	  {
		 
		  if (hmap.containsKey(c))
		  {
						   hmap.put(c, hmap.get(c)+1);
						   System.out.println("true" );
					  
		  }	
	  else 
	  {
		  hmap.put(c, 1);
		  System.out.println("keyset is "+keys);
		
		}
		  
		 
	}
	 
	for (int i=0;i<keys.size();i++) {
		   System.out.println("lenght is " +keys.size());
		   counter++;
	  } 
	  
	  //System.out.println("" +c); 
	  keys.clear();
	  System.out.println(""+counter);
	 // System.out.println(" "+firstletter+counter+lstletter);
	 // System.out.println("word is "+word);
	  
	  
	return counter;
	
		//System.out.println(""+lastletter);
		
		//return word;
		
		
		
			
	}
	private static List<Character> LinkedList(char[] charArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void distinctletter() {
		String string = "Freedom Mortgage";
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		//Using For loop
        for (char c : string.toCharArray()) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);

        charCountMap.clear();
        //Using Streams Java 8
        List<Character> list = string.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("List of characters" +list);
        list.stream().forEach(c -> charCountMap.merge(c, 1, Integer::sum));

        System.out.println(charCountMap);
	}
	public static String reverseword(String str) {
		/*String temp;
		String [] words = word.split("\\s+");
		for (int i=0;i<words.length-1;i++) {
			
			for (int j=words.length-1;j>0;j--) {
				
				temp = words[i];
				words[i] = words[j];
				System.out.println("" +words[i]);
				words[j] = temp;
				System.out.println("" +words[j]);
				
				//word = words[i].concat(words[j]);

							}
		//	System.out.println(" reveresed is "+word);
*/			
		String [] temp = str.split(" +");
        String result = "";
        for(int i=0;i<temp.length;i++) {
          result = result.join(" ", temp[i], result);
        }
        System.out.println("" +result);
        return result.trim();
		
	}
	public static String wordreverse(String str) {
		String [] temp = str.split(" +");
        String result = "";
        for(int i=0;i<temp.length;i++) {
          result = result.join(" ", temp[i],result);
          System.out.println("****"+result);
        }
        System.out.println("****"+result);

        return result.trim();
    }
	
	public static String wordreverse(int x) {
		int [] temp  ;
		
		String temp1=Integer.toString(x);
		temp=temp1.chars().map(c->c-'0').toArray();
		System.out.println(""+temp.toString());
		
		
		return null;
	}
    static  LinkedHashMap<Character, Integer> hmap1 = new LinkedHashMap<Character , Integer>();
    static  LinkedHashMap<Character, Integer> hmap2 = new LinkedHashMap<Character , Integer>();
    static Set<Character>keys1;
    static Set<Character>keys2;
	//static List <Character> listkeys1 = new LinkedList (keys1);
	//static List <Character> listkeys2 = new LinkedList (keys2);
 static int counter =0;
static boolean t = false;
static int sum1=0;
	 public static int countCharacters(String[] words, String chars) {
	        
	        for (int i=0;i<words.length;i++) {
	        	String temp = words[i];
	        	
	        	for (char c: temp.toCharArray()) {
	        		if (hmap1.containsKey(c)) {
		        		hmap1.put(c, hmap1.get(c)+1);
		        	}
	        		else {
	        		hmap1.put(c, 1);
	        	}
	         }
	       keys1 = hmap1.keySet();
	        	
	        char[] c1 = chars.toCharArray();
	         for (char c2 : c1) {
	        	 if (hmap2.containsKey(c2)) {
		        		hmap2.put(c2, hmap2.get(c2)+1);
		        	}
	        		else {
	        		hmap2.put(c2, 1);
	        	}
	              }
		       keys2 = hmap2.keySet();
		      
            Set<Map.Entry<Character,Integer>>map=hmap1.entrySet();
            for (Map.Entry<Character,Integer>data : map) {
            	
            	if (!hmap2.containsKey(data.getKey())) {
            		System.out.println("Nothing is present");
            		t=false;
            		break;
            	}
            	else  if (hmap2.get(data.getKey())>=data.getValue()){
            		t=true;
            		counter++;
            		System.out.println("counter" +counter);
            		break;
            	}
            	else  if (hmap2.get(data.getKey())<data.getValue()){
            		t=false;
            	System.out.println("counter" +counter);
            	break;
            	}
		       
	        
	    } 
            if (t == true) 
	    	
	    	sum1 = sum1+temp.length();
	    System.out.println("sum s "+ sum1);
            
            hmap1.clear();
	        
		 } 					
	        return sum1;
	}
	        	
	        
	        
 public static void noofoccurance(int [] n) {
	 int count =0;
	 HashMap<Integer, Integer>numbers=new HashMap<Integer, Integer>();	
	 int ele=0;
	 int occ=0;
	 for (int m :n) {
			 
	 			 if (!numbers.containsKey(m)) 
	 				 numbers.put(m, 1);
	 			 
	 			 else 
	 				 numbers.put(m, numbers.get(m)+1);
	 } 
	 			for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) 
	 	        { 
	 	            if( ele==entry.getKey())
	 	            {
	 	                occ=entry.getValue();
	 	            }
		 			System.out.println(""+occ);

	 	        }
	 	}
	 

	 
	 
 
	        
	        
 public static int countingchar(String []words, String chars) {
	 char c[]=chars.toCharArray();
     int sum=0;
     HashMap<Character,Integer>map=new HashMap<>();
     for(char i:c)
     {
         if(!map.containsKey(i))
             map.put(i,1);
         else
             map.put(i,map.get(i)+1);
     }
     
     
     for(int j=0;j<words.length;j++)
     {
         String s=words[j];
         char st[]=s.toCharArray();
          HashMap<Character,Integer>map1=new HashMap<>();
          for(char ch:st)
     {
         if(!map1.containsKey(ch))
             map1.put(ch,1);
         else
             map1.put(ch,map1.get(ch)+1);
     }
         int count=0;
         boolean t=false;
         Set<Map.Entry<Character,Integer>>hmap1=map1.entrySet();
         for(Map.Entry<Character,Integer>data:hmap1)
         {
             
             if(!map.containsKey(data.getKey()))
             {
                 t=false;
                 break;
                 
             }
             else if(map.get(data.getKey())>=data.getValue())
             {
                 t=true;
                 count++;
             }
             else if(map.get(data.getKey())<data.getValue())
             {
                 t=false;
                 break;
             }
         }
         if(t==true)
             sum=sum+s.length();
         System.out.println("sum is "+sum);
         map1.clear();
         
     }
     
     return sum;
     
 }
 
 public static String palindorme(String s) {
	 
		    if (s == null || s.length() < 1) return "";
		    int start = 0, end = 0;
		    for (int i = 0; i < s.length(); i++) {
		        int len1 = expandAroundCenter(s, i, i);
		        int len2 = expandAroundCenter(s, i, i + 1);
		        int len = Math.max(len1, len2);
		        if (len > end - start) {
		            start = i - (len - 1) / 2;
		            end = i + len / 2;
		        }
		    }
		    String result = s.substring(start, end + 1);
		    System.out.println("result is "+result);
		    return result;
		}

		private static int expandAroundCenter(String s, int left, int right) {
		    int L = left, R = right;
		    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
		        L--;
		        System.out.println("l is "+L);
		        R++;
		        System.out.println(" R is "+R);
		    }
		    return R - L - 1;
		}

 public static  boolean palindromeint(int num) {
	boolean value = true;
	 
	 int[] s=Integer.toString(num).chars().map(c -> c-'0').toArray();
	 int i =0;
	 int j = s.length-1;
	 while (i<=j) {
			/*
			 * int temp1 = s[i]; int temp2 = s[j];
			 */
		System.out.println("first i indes element "+i +"  "+s[i]);
			 if (!(s[i] == s[j])) 
				 value= false;
			 i++;
			 j--;
			 }
	 System.out.println(""+value);
	 return value;
	 }
 	
 
 
 
	 
 public static String reversestring(String word) {
	 char[] words = word.toCharArray();
	 int j=word.length()-1;
	 char temp;
	 for (int i=0;i<j;i++,j--) {
		 temp = words[i];
		 words[i]=words[j];
		 words[j]=temp;
	 }
	 for (char c: words) {
		 System.out.println("wreeres" +c);
	 }
	 
	return words.toString();
	 
 }
 
 public static void inttonum(String word) {
		/*
		 * int num =123456; int[] word = Integer.toString(num).chars().map(c->
		 * c-'0').toArray(); for (int c: word) {
		 * 
		 * System.out.println("number is " +c); }
		 */
	 int count =0;
	char[] words= word.toCharArray();
         	
     	for (char c: words) {
     		if (hmap1.containsKey(c)) {
	        		hmap1.put(c, hmap1.get(c)+1);
	        	}
     		else {
     		hmap1.put(c, 1);
     	}
      }
	 
     
     for (Map.Entry<Character, Integer> map:hmap1.entrySet()) {
    	 if (map.getValue() >1) {
    		 break;    	 }
    	 count++;
     	}
     System.out.println(""+count);
 }
 
 public static int firstUniqChar(String s) {
     LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
     for(int i = 0 ; i < s.length(); i++) {
         if(!hmap.containsKey(s.charAt(i))) {
        	 System.out.println("map"+hmap);
             hmap.put(s.charAt(i), i);
         } else {
             hmap.put(s.charAt(i), -1);
         }
     }
     int result = Integer.MAX_VALUE;
     for(Map.Entry<Character, Integer> me: hmap.entrySet()) {
         if(me.getValue() < result && me.getValue() != -1) {
             result = me.getValue();
             System.out.println(""+result);
         }
     }
     System.out.println(""+result);
     return result == Integer.MAX_VALUE ? -1 : result;
 }
 
 
 public static void ojectmap() {
		Object[] run ={"they", 1, "teygdh",'c'};
		ArrayList<Object>ob = new ArrayList<Object>();
		
		//ob.add(run);
		System.out.println(run.length);
		System.out.println(ob.size());
		int i=0;
		for (Object b: run) {
			
			System.out.println("++++" +run[i]);
			System.out.println("-----" + run.length);
			ob.add(run[i]);
			System.out.println("obj vakeu " +ob.get(i).toString());

			i++;
		}
		System.out.println(ob.size());
		/*
		 * for (int i=0;i<ob.size();i++) {
		 * 
		 * System.out.println("***" +ob.get(i).toString()); }
		 */
 }
	 
 
 public static boolean isprime(int num) {
	 if (num<=1) {
		 return false;}
	 for (int i=2;i<num;i++) {
		 System.out.println(""+i);
		 if (num%i==0)
	 		return false;
	 }
	 return true;
 }
 

 public static void getprimenumber(int num) {
	 
	 for (int i=2;i<=num;i++) {
		if(isprime(i))
		 System.out.println("Primenmumbers are "+i);
		 }
	 
			
			  StringBuffer sb = new StringBuffer(); StringBuilder sb2 = new
			  StringBuilder();
			  
			  sb.reverse();
			 
	 
	 
 }
 
 public static String reveseword(String word) {
	 char[] foreversal = word.toCharArray();
	 
	 for (int i=word.length()-1;i>=0;i--) {
		 
		 char tru = foreversal[i];
		 
		 
		 System.out.println(""+tru);
		 
	 }
	 
	 return word;
 }
 
 public static int reverseint(int x) {
	        int number;
	        int answer = 0;
	        int dup = x;
	        String str = "";
	        if ( x < 0) {
	            x = ~(x - 1);
	            System.out.println(""+x);
	            if( x == 0) { return 0; }
	            while(x > 0) {
	                number = x % 10;
	                
	                str += number;
	                
	                x = x / 10;
	            }
	              try { 
	                answer = Integer.parseInt(str);
	    			System.out.println(""+answer);

	              } catch(Exception e) {
	                  answer = 0;
	              }
	                if(dup < 0) { answer  = (~(answer - 1)); }
	    			System.out.println(""+answer);

	                }return answer;

	            }

 public static void intpalindrome(int k) {
	 
	 boolean value = false;
	 
	 String d = Integer.toString(k);
	 String reverse="";
	 int len = d.length();
	 int i=0;
	 ArrayList tempt = new ArrayList();
	 
	 
	 if (!d.equals("0")){
	 
	 for (int j=len-1;j>=0;j--) {
		 reverse = reverse +d.charAt(j);
		 System.out.println(""+reverse);}
		if(reverse.equals(d)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not palindrome");

		}
	 }
	 else {
			System.out.println("Not palindrome");

	 	}
 	}

	 
 

	
	public static void main(String[] args) {
		String [] test ={"tc","hat","bc"};
		String word = "testing";
	//	int []num = {10,20,30,40,10};
		// TODO Auto-generated method stub
		//freedomsum(10,10,2);
		//replaceword("bbbbbb");
		//stringsplit("Freedo@m Mortgage");
		//distinctletter();
		//System.out.println("sum is " + sum);
		//reverseword("hello world time");	
	//wordreverse(96585658);
	//	countCharacters(test, "attach");
	//countingchar(test,"attach");
		//palindorme("ababcf");
		//palindromeint(151);
		//reversestring("their");
		//firstUniqChar("loveleetcode");
		//ojectmap();
		System.out.println("is prime ?"+	isprime(7));
		//getprimenumber(100);
		reveseword(word);
	//	noofoccurance(num);
		//reverseint(-126);
		intpalindrome(0);
	}
	
	        }
	
	


