package com.leetcode.solutions;

import java.util.Calendar;

/**
 * 1154. Day of the Year
 *
 * Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
 *
 * Example 1:
 *
 * Input: date = "2019-01-09"
 * Output: 9
 * Explanation: Given date is the 9th day of the year in 2019.
 * Example 2:
 *
 * Input: date = "2019-02-10"
 * Output: 41
 * Example 3:
 *
 * Input: date = "2003-03-01"
 * Output: 60
 * Example 4:
 *
 * Input: date = "2004-03-01"
 * Output: 61
 *
 * Constraints:
 *
 * date.length == 10
 * date[4] == date[7] == '-', and all other date[i]'s are digits
 * date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.
 * */
public class _1154 {
    public static class Solution1 {
        Calendar cal = Calendar.getInstance();

        public int dayOfYear(String date) {
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(5, 7));
            int day = Integer.parseInt(date.substring(8, 10));
            int thirtyDays = 30;
            int thirtyOneDays = 31;
            if (month == 1) {
                return day;
            } else if (month == 2) {
                return day + thirtyOneDays;
            } else {
                int daysInFeb = isLeapYear(year) ? 29 : 28;
                if (month == 3) {
                    return thirtyOneDays + daysInFeb + day;
                } else if (month == 4) {
                    return 2 * thirtyOneDays + daysInFeb + day;
                } else if (month == 5) {
                    return 2 * thirtyOneDays + daysInFeb + day + thirtyDays;
                } else if (month == 6) {
                    return 3 * thirtyOneDays + daysInFeb + day + thirtyDays;
                } else if (month == 7) {
                    return 3 * thirtyOneDays + daysInFeb + day + 2 * thirtyDays;
                } else if (month == 8) {
                    return 4 * thirtyOneDays + daysInFeb + day + 2 * thirtyDays;
                } else if (month == 9) {
                    return 5 * thirtyOneDays + daysInFeb + day + 2 * thirtyDays;
                } else if (month == 10) {
                    return 5 * thirtyOneDays + daysInFeb + day + 3 * thirtyDays;
                } else if (month == 11) {
                    return 6 * thirtyOneDays + daysInFeb + day + 3 * thirtyDays;
                } else {
                    return 6 * thirtyOneDays + daysInFeb + day + 4 * thirtyDays;
                }
            }
        }

        private boolean isLeapYear(int year) {
            cal.set(Calendar.YEAR, year);
            return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        }
    }
}
