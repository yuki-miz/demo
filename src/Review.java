import java.io.*;
import java.util.Date;
import java.text.*;

class Review {
	public static void main(String[] args){
		System.out.println(getTodayString());
	}

	//本日の日付を、アンダーバー接続の文字列で返す
	public static String getTodayString(){
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd");
		return format.format(now);
	}
}
