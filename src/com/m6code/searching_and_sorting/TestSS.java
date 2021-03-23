package com.m6code.searching_and_sorting;

import com.m6code.stdlib.StdIn;
import com.m6code.stdlib.StdOut;
import com.m6code.stdlib.StdRandom;

/**
 * A Class to test Sequential Search
 */
public class TestSS {
    public static int search(String key, String[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i].compareTo(key) == 0) return i;
        return -1;

    }

    public static void main(String[] args) {
        String[] words = StdIn.readAllStrings();
        int N = words.length;
        double start = System.currentTimeMillis() / 1000.0;
        for (int i = 0; i < 10 * N; i++) {
            String key = words[StdRandom.uniform(N)];
            if (search(key, words) == -1)
                StdOut.println(key);
        }
        double now = System.currentTimeMillis() / 1000.0;
        StdOut.print(Math.round(now - start) + " seconds\n");
    }
    // From terminal navigate to production folder and run
    // Like this `cd out/production/cs_an_interdisciplinary_approach`
    // java com.m6code.searching_and_sorting.Generator 10000 10 abcdefghijklmnopqrstuvwxyz | java com.m6code.searching_and_sorting.TestSS
    // java com.m6code.searching_and_sorting.Generator 60000 10 abcdefghijklmnopqrstuvwxyz | java com.m6code.searching_and_sorting.TestSS

    // /usr/local/android-studio/jre/bin/java -javaagent:/usr/local/intelliJidea/lib/idea_rt.jar=43725:/usr/local/intelliJidea/bin -Dfile.encoding=UTF-8 -classpath /usr/local/android-studio/jre/jre/lib/charsets.jar:/usr/local/android-studio/jre/jre/lib/ext/cldrdata.jar:/usr/local/android-studio/jre/jre/lib/ext/dnsns.jar:/usr/local/android-studio/jre/jre/lib/ext/jaccess.jar:/usr/local/android-studio/jre/jre/lib/ext/localedata.jar:/usr/local/android-studio/jre/jre/lib/ext/nashorn.jar:/usr/local/android-studio/jre/jre/lib/ext/sunec.jar:/usr/local/android-studio/jre/jre/lib/ext/sunjce_provider.jar:/usr/local/android-studio/jre/jre/lib/ext/sunpkcs11.jar:/usr/local/android-studio/jre/jre/lib/ext/zipfs.jar:/usr/local/android-studio/jre/jre/lib/jce.jar:/usr/local/android-studio/jre/jre/lib/jsse.jar:/usr/local/android-studio/jre/jre/lib/management-agent.jar:/usr/local/android-studio/jre/jre/lib/resources.jar:/usr/local/android-studio/jre/jre/lib/rt.jar:/home/alonmust/IdeaProjects/cs_an_interdisciplinary_approach/out/production/cs_an_interdisciplinary_approach:/home/alonmust/IdeaProjects/cs_an_interdisciplinary_approach/stdlib.jar com.m6code.searching_and_sorting.TestSS
}
