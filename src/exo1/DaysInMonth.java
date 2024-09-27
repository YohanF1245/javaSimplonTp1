package exo1;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.regex.Pattern;

public class DaysInMonth {
	private HashMap<String, Integer> months = new HashMap<>();
	private String month = "Janvier";
	public DaysInMonth() {
	months.put("janvier", 30);
	months.put("fevrier", 28);
	months.put("mars", 31);
	months.put("avril", 30);
	months.put("mai", 31);
	months.put("juin", 30);
	months.put("juillet", 31);
	months.put("aout", 31);
	months.put("septembre", 30);
	months.put("octobre", 31);
	months.put("novembre", 30);
	months.put("decembre", 31);
	}
	private String normalizeString() {
		String normalizedMonth = month.toLowerCase();
		normalizedMonth = Normalizer.normalize(month, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{M}");
        return pattern.matcher(normalizedMonth).replaceAll("").toLowerCase();
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDays() {
		int days = 40;
		if(months.containsKey(normalizeString())){
			
		days = months.get(normalizeString());
		};
		return days;
	}
}
