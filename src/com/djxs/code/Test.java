package com.djxs.code;


import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	CreateQRCode qrcode = new CreateQRCode();
	CreateQRCode.CreatQrCode(5, 'Q', "民谣很穷，一根烟一杯酒", "d:/0961160132/images/QQ.png", 20, "d:/0961160132/zzc.png", "255,0,0", "0,0,255");
	System.out.println("ok");
}
}
