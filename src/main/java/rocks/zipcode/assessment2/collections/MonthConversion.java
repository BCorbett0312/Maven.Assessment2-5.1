package rocks.zipcode.assessment2.collections;



import java.util.Map;
import java.util.TreeMap;


/**
 * Use a map to solve
 */
public class MonthConversion {
    Map calendarMap = new TreeMap();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        calendarMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(calendarMap.containsKey(monthNumber)){
            return calendarMap.get(monthNumber).toString();
        }

        return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        if (isValidMonth(monthName)){

            for(Object o: calendarMap.keySet()) {
                if (calendarMap.get(o).equals(monthName)) {
                    return (Integer) o;
            }
        }



        }


       return (Integer) null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return calendarMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return calendarMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calendarMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calendarMap.replace(monthNumber, monthName);
    }
}
