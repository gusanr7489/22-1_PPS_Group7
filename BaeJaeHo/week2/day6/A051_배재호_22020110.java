package week2;

public class A051_πË¿Á»£_22020110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte_encoding(text);
	}
	public static void byte_encoding(String text) {
		byte[] byteText = text.getBytes();
		for(int i=0;i<text.length();i++) {
			byte encode = (byte) (byteText[i] + 3);
			// System.out.println(encode);
			if(encode>90) encode -= 26;
			byteText[i]=encode;
		}
		String byteToText = new String(byteText);
		System.out.println(byteToText);
	}

}
