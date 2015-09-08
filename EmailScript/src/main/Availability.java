package main;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Availability {
	
	public boolean checkAvailability(GregorianCalendar date) throws IOException {
		
		int month = date.get(Calendar.MONTH); // 0 = January
		int weekOfMonth = date.get(Calendar.WEEK_OF_MONTH); // 1 = First week
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK); // 1 = Sunday
		
		Document doc = Jsoup.connect("http://www.funatwindsorhills.com/vacation-homes/townhouse-1/").get();
		Element iframe = doc.select("iframe").get(1);
		String iframeSrc = iframe.attr("src");
		Document iframeDoc = Jsoup.connect(iframeSrc).get();
		Elements temp = iframeDoc.select("table#availability1_ASPxCalendar1_mt_0x0");
		System.out.println(temp);
		return false;
	}

	@Override
	public String toString() {
		return "Availability []";
	}
}
