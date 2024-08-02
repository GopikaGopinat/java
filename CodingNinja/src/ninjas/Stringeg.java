package ninjas;

public class Stringeg {
	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		String s2=String.format("%d",301);
		String s3=String.format("%x",101);
		String a="Javatpoint";
		a=a.toUpperCase();
		String a1="JAVATPOINT java";
		String a2="ABCDEFG";
		
		a2=a2.toLowerCase();
		String a3=a.intern();
		String a4="";
		String a5="java string split method by javatpoint";
		String[]words=a5.split("\\s");
		char c[]=a.toCharArray();
		/*for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}*/
		/*for(String w:words)
		{
			System.out.println(w);
		}*/
		char ch[]=new char[10];
		a1.getChars(2,9,ch,0); 
		int index=a1.indexOf("java");
		String date=String.join("/","25","06","2024");
		int index1=a1.lastIndexOf('T');
		String rs=a1.replace("T","K");
		String substr=a.substring(0);
		
		
		
	/*byte[]barr=a2.getBytes();
		for(int i=0;i<barr.length;i++)
		{
			System.out.println(barr[i]);
		*/
		//s=s.concat("World");//concatinated value
		//s.concat("World");//non-concatinated value
		//char ch=a.charAt(4);//charAt
		//System.out.println(s);
		//System.out.println(ch);
		//System.out.println(s.compareTo(s1));
		//System.out.println(a.compareTo(s));
		//System.out.println(a.contains("point"));
		//System.out.println(a.contains("hello"));
		//System.out.println(a.endsWith("point"));
		//System.out.println(a.equals(a1));
		//System.out.println(s.equals(s1));
		//System.out.println(a.equalsIgnoreCase(a1));
		//System.out.println(a.equalsIgnoreCase(s));
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(ch);
		//System.out.println(index);
		//System.out.println(a==a3);
		//System.out.println(a4.isEmpty());
		//System.out.println(date);
		//System.out.println(index1);
		//System.out.println(a2.length());
		//System.out.println(rs);
		String str="java";
		String regex="";
		str=str.replaceAll(regex,  " ");
		//System.out.println(str);
		//System.out.println(a.startsWith("J"));
		//System.out.println(substr);
		//System.out.println(a2);
		//System.out.println(a);
		System.out.println(a1.trim()+"java");
		
		
		
	}

}
