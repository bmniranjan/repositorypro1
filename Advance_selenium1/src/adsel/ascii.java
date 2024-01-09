package adsel;

public class ascii {

	public static void main(String[] args) {
	String s="MD#71a2*"	;
	String uc="";
	String lc="";
	String no="";
	String sc="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		int ascii=(int)ch;
		if(ascii>=48&&ascii<=57)
		{
		no=	no+ch;
		}
		else if(ascii>=65&&ascii<=90)
		{
		
		uc=	uc+ch;
		}
		else if(ascii>=97&&ascii<=122)
		{
		
		lc=	lc+ch;
		}
		else
		{
		sc=sc+ch;
		}
		


		
	}
	System.out.println(uc);
	System.out.println(lc);
	System.out.println(sc);
	System.out.println(no);
	
	
	}

}
