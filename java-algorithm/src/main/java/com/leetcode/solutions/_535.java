package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 535. Encode and Decode TinyURL
 *
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
 * and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

 Note: Do not use class member/global/static variables to store states. Your encode and decode algorithms should be stateless.
 */

public class _535 {

    public static class Solution1 {
        /**
         * Simple counter approach
         * Analysis:
         *      The range of URLs that can be decoded is limited by the range of Integer.
         *      If excessively large number of URLs have to be encoded, after the range of Integer is exceeded,
         *          integer overflow could lead to overwriting previous URL's encodings.
         *      The length of the URL isn't necessary shorter than incoming URL.
         *      One potential security issue with this problem is that it's very easy to predict the next code generated,
         *          since this pattern is very easy to be detected.
         */
        public class Codec {
            public static final String PREFIX = "http://tinyurl/";
            int                        i      = 0;
            Map<Integer, String>       map    = new HashMap();

            public String encode(String longUrl) {
                map.put(i, longUrl);
                return PREFIX + i++;
            }

            public String decode(String shortUrl) {
                return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
            }
        }
    }

    public static class Solution2 {
        /**
         * Use Java built-in HashCode
         * Analysis:
         *      hashCode() does NOT generate unique codes for different strings, collision might happen.
         *          As the number of URLs increase, the probability of getting collision increases which leads to failure.
         */
        public class Codec {
            public static final String PREFIX = "http://tinyurl/";
            Map<Integer, String>       map    = new HashMap<>();

            // Encodes a URL to a shortened URL.
            public String encode(String longUrl) {
                /**I don't need to create a local variable to cache longUrl.hashCode()
                 * since Java's String cache it already. :) Look at its source code.*/
                map.put(longUrl.hashCode(), longUrl);
                return PREFIX + longUrl.hashCode();
            }

            // Decodes a shortened URL to its original URL.
            public String decode(String shortUrl) {
                return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
            }
        }
    }

    public static class Solution3 {
        public static final String PREFIX = "http://tinyurl/";
        /**Use a random number*/
        Map<Integer, String>       map    = new HashMap<>();
        Random                     random = new Random();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            int num = random.nextInt(Integer.MAX_VALUE);
            while (map.containsKey(num)) {
                num = random.nextInt(Integer.MAX_VALUE);
            }
            map.put(num, longUrl);
            return PREFIX + num;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
        }
    }

    public static class Solution4 {
        public static final String PREFIX       = "http://tinyurl/";
        public static final int    FIXED_LENGTH = 7;
        /**
         * Use a random but fixed length encoding
         * Analysis:
         *      1. This is the most optimal solution so far.
         *      2. The number of URLs that can be encoded can be as big as Math.pow((10 + 26*2), FIXED_LENGTH)
         *      3. The length of the shortened URL is fixed at a certain length, which could be a significant reduce for large URLs
         *      4. The performance of this scheme is pretty good, due to much smaller probability of encountering collision
         *      5. Predicting pattern/encoding isn't possible in this case since random numbers are used.
         */
        Map<String, String>        map          = new HashMap<>();
        Random                     random       = new Random();
        String                     alphabet     = "0123456789abcdefghijklmnopgrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortKey = getRandomFixedLengthKey();
            while (map.containsKey(shortKey)) {
                shortKey = getRandomFixedLengthKey();
            }
            map.put(shortKey, longUrl);
            return PREFIX + shortKey;
        }

        private String getRandomFixedLengthKey() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < FIXED_LENGTH; i++) {
                stringBuilder.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            return stringBuilder.toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl.substring(PREFIX.length()));
        }
    }
}
