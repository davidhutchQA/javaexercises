package exercises;

public class TooHot {
int topCap=90;
int lowCap=60;

/**
 * check temperature and season, if in range
 * @param temp
 * @param isSummer
 * @return in range or not
 */
	public boolean tooHot(int temp, boolean isSummer) {
		if (isSummer) {
			topCap=100;
		}else
			topCap=90;
		if (temp>=lowCap&&temp<=topCap) {
			return true;
		}
		return false;
	}
}