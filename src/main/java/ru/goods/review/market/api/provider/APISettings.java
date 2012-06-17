package ru.goods.review.market.api.provider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 1:20
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public abstract class APISettings {
    private static final String API_KEY_PATH = "api_key.txt";
    public static String API_KEY;
    public static final String API_VERSION = "v1";
    public static final String MAIN_API_URL = "https://api.content.market.yandex.ru/" + API_VERSION;
    public static final String GEO_ID_PARAM = "geo_id=0";
    public static final String RESPONSE_FORMAT = ".json";
    public static final int TIMEOUT = 100;

    static {
        try {
            API_KEY = new Scanner(new File(API_KEY_PATH)).nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private APISettings(){}

}
