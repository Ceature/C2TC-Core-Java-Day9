package wrapperclass;
public class Autoboxing {

	public static void main(String[] args) {
		 byte b=20;
		 short s=20;
		 int i=20;
		 long l=30;
		 float j=12.89f;
		 double d=40.99d;
		 char c='a';
		 boolean b2=true;
		 //Autoboxing: converting from Primitive to objects
           Byte byteobj=b;
           Short shortobj=s;
           Integer intobj=i;
           Long longobj=l;
           Float floatobj=j;
           Double doubleobj=d;
           Character charobj=c;
           Boolean booleanobj=b2;
           System.out.println("Printing Object values");
           System.out.println("Byte object="+byteobj);
           System.out.println("Short object="+shortobj);
           System.out.println("Integer object="+intobj);
           System.out.println("Long object="+longobj);
           System.out.println("Float object="+floatobj);
           System.out.println("Double object="+doubleobj);
           System.out.println("Character object="+charobj);
           System.out.println("Boolean object="+booleanobj);
           //unboxing:Convertin from objects to primrtive
           Byte bytevalue=byteobj;
           Short shortvalue=shortobj;
           Integer intvalue=intobj;
           Long longvalue=longobj;
           Float floatvalue=floatobj;
           Double doublevalue=doubleobj;
           Character charvalue=charobj;
           Boolean booleanvalue=booleanobj;
           System.out.println("Printing primitive values");
           System.out.println("Byte value="+bytevalue);
           System.out.println("Short value="+shortvalue);
           System.out.println("Integer value="+intvalue);
           System.out.println("Long value="+longvalue);
           System.out.println("Float value="+floatvalue);
           System.out.println("Double value="+doublevalue);
           System.out.println("Character value="+charvalue);
           System.out.println("Boolean value="+booleanvalue);
	}

}